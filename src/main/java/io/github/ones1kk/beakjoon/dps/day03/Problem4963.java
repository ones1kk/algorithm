package io.github.ones1kk.beakjoon.dps.day03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4963 {

    static int[] dirY = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dirX = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            boolean[][] map = new boolean[60][60];
            boolean[][] visited = new boolean[60][60];

            for (int i = 1; i <= h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= w; j++) {
                    map[i][j] = st.nextToken().equals("1");
                }
            }


            int answer = 0;
            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= w; j++) {
                    if (map[i][j] && !visited[i][j]) {
                        dfs(i, j, visited, map);
                        answer++;
                    }
                }
            }
            bw.append(String.valueOf(answer)).append("\n");
        }

        br.close();
        bw.close();
    }

    private static void dfs(int i, int j, boolean[][] visited, boolean[][] map) {
        visited[i][j] = true;
        for (int k = 0; k < 8; k++) {
            int newX = i + dirX[k];
            int newY = j + dirY[k];
            if (map[newX][newY] && !visited[newX][newY]) {
                dfs(newX, newY, visited, map);
            }

        }
    }
}
