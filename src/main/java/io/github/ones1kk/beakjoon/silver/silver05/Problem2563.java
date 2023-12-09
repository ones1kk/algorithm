package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2563 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int extra = 10;

        boolean[][] visited = new boolean[100][100];
        int result = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + extra; j++) {
                for (int k = y; k < y + extra; k++) {
                    if (!visited[k][j]) {
                        result++;
                        visited[k][j] = true;
                    }
                }
            }
        }
        System.out.println(result);

        br.close();
    }
}
