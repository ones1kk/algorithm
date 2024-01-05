package io.github.ones1kk.beakjoon.dps.day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem2583 {
    static int M, N, K;
    static int[][] graph;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static int size;
    static List<Integer> result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        graph = new int[M][N];
        result = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    graph[y][x] = 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == 0) {
                    size = 1;
                    dfs(i, j);
                    result.add(size);
                }
            }
        }

        Collections.sort(result);

        bw.append(String.valueOf(result.size())).append("\n");
        for (int r : result) {
            bw.append(String.valueOf(r)).append(" ");
        }

        bw.flush();
        bw.close();
    }

    public static void dfs(int y, int x) {
        graph[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int nx = dirX[i] + x;
            int ny = dirY[i] + y;

            if (nx >= 0 && ny >= 0 && nx < N && ny < M && graph[ny][nx] == 0) {
                size++;
                dfs(ny, nx);
            }
        }
    }
}
