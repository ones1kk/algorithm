package io.github.ones1kk.beakjoon.silver.silver04.day08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2491 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        boolean[][] check = new boolean[2][n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i > 0) {
                check[0][i] = arr[i] >= arr[i - 1];
                check[1][i] = arr[i] <= arr[i - 1];
            }

        }

        int answer = getAnswer(n, check);

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }

    private static int getAnswer(int n, boolean[][] check) {
        int sum1 = 0;
        int sum2 = 0;
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (check[0][j]) {
                    answer1++;
                } else {
                    sum1 = Math.max(sum1, answer1);
                    answer1 = 0;
                }
                if (check[1][j]) {
                    answer2++;
                } else {
                    sum2 = Math.max(sum2, answer2);
                    answer2 = 0;
                }
            }
        }

        return Math.max(sum1, sum2) + 1;
    }
}
