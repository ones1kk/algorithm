package io.github.ones1kk.beakjoon.dps.day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem2468 {

    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    static int MAX = 110;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[MAX][MAX];
        boolean[][] visited = new boolean[MAX][MAX];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                max = Math.max(max, map[i][j]);
            }
        }

        int idx = 0;
        List<Integer> list = new ArrayList<>();
        while (idx != max) {
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][j] > idx && !visited[i][j]) {
                        dfs(i, j, map, visited, n, idx);
                        answer++;
                    }
                }
            }

            list.add(answer);
            idx++;
            visited = new boolean[MAX][MAX];
        }

        Collections.sort(list);
        bw.append(String.valueOf(list.get(list.size() - 1)));

        br.close();
        bw.close();
    }

    private static void dfs(int y, int x, int[][] map, boolean[][] visited, int n, int idx) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (map[newY][newX] > idx && !visited[newY][newX]) {
                dfs(newY, newX, map, visited, n, idx);
            }
        }
    }
}
