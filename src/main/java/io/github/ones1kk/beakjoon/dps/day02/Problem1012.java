package io.github.ones1kk.beakjoon.dps.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1012 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            boolean[][] map = new boolean[100][100];
            boolean[][] visit = new boolean[100][100];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y + 1][x + 1] = true;
            }

            int answer = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (map[i][j] && !visit[i][j]) {
                        answer++;
                        dfs(i, j, visit, map);
                    }
                }
            }

            bw.append(String.valueOf(answer)).append("\n");
        }

        br.close();
        bw.close();
    }

    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    private static void dfs(int y, int x, boolean[][] visited, boolean[][] map) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (map[newY][newX] && !visited[newY][newX]) {
                dfs(newY, newX, visited, map);
            }
        }
    }
}
