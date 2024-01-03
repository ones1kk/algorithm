package io.github.ones1kk.beakjoon.dps.day04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2667 {

    static int ANSWER = 0;
    static int MAX = 30;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[MAX][MAX];
        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= n; j++) {
                map[i][j] = line.charAt(j - 1) == '1';
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j]) {
                    int count = dfs(i, j, map, 1);
                    ANSWER++;
                    list.add(count);
                }
            }
        }

        Collections.sort(list);

        bw.append(String.valueOf(ANSWER)).append("\n");
        for (Integer i : list) {
            bw.append(String.valueOf(i)).append("\n");
        }

        br.close();
        bw.close();
    }

    private static int dfs(int y, int x, boolean[][] map, int count) {
        map[y][x] = false;
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (map[newY][newX]) {
                count = dfs(newY, newX, map, count + 1);
            }
        }
        return count;
    }
}
