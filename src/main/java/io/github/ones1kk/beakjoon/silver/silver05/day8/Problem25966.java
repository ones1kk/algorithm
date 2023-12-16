package io.github.ones1kk.beakjoon.silver.silver05.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem25966 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        for (int i = 0; i < q; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st2.nextToken());
            int first = Integer.parseInt(st2.nextToken());
            int second = Integer.parseInt(st2.nextToken());
            if (command == 0) {
                int k = Integer.parseInt(st2.nextToken());
                arr[first][second] = k;
            } else {
                int[] temp;
                temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
