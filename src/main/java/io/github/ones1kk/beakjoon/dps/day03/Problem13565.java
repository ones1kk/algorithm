package io.github.ones1kk.beakjoon.dps.day03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem13565 {

    static boolean answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] map = new boolean[1010][1010];
        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= m; j++) {
                map[i][j] = line.charAt(j - 1) == '0';
            }
        }

        for (int i = 1; i <= m; i++) {
            if (map[1][i]) {
                dfs(1, i, map, n);
            }
        }


        if (answer) {
            bw.append("YES");
        } else {
            bw.append("NO");
        }

        br.close();
        bw.close();
    }

    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    private static void dfs(int y, int x, boolean[][] map, int n) {
        if (y == n) {
            answer = true;
            return;
        }
        map[y][x] = false;
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (map[newY][newX]) {
                dfs(newY, newX, map, n);
            }
        }
    }
}
