package io.github.ones1kk.beakjoon.suggestion.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1992 {

    // 문제가 이해 안감
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 1; j < n; j++) {
                arr[i][j] = Integer.parseInt(split[j]);
            }
        }


        br.close();
    }
}
