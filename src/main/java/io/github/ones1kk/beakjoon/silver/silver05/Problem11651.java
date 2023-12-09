package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11651 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr, (a1, a2) -> {
            if (a1[1] == a2[1]) {
                return Integer.compare(a1[0], a2[0]);
            }
            return Integer.compare(a1[1], a2[1]);
        });

        for (int[] ints : arr) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
