package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11650 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
            if (a1[0] == a2[0]) {
                return Integer.compare(a1[1], a2[1]);
            }

            return Integer.compare(a1[0], a2[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (int[] val : arr) {
            sb.append(val[0])
                    .append(" ")
                    .append(val[1])
                    .append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
