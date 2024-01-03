package io.github.ones1kk.beakjoon.dps.day04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem16173 {

    static int[] dirY = {1, 0};
    static int[] dirX = {0, 1};

    static final int MAX = 113;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[MAX][MAX];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1, 1, map, n);

        if (map[n][n] == 0) {
            bw.append("HaruHaru");
        } else {
            bw.append("Hing");
        }

        br.close();
        bw.close();
    }

    private static void dfs(int y, int x, int[][] map, int n) {
        int value = map[y][x];
        map[y][x] = 0;
        if (y == n && x == n) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            int newY = y + dirY[i] * value;
            int newX = x + dirX[i] * value;
            if (map[y][x] != 0) {
                dfs(newY, newX, map, n);
            }
        }
    }
}
