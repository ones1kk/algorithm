package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2751 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        solve(arr);
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

    public static int[] solve(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
