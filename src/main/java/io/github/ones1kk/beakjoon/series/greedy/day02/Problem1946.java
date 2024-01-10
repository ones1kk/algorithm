package io.github.ones1kk.beakjoon.series.greedy.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1946 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            Integer[] arr = new Integer[n + 1];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a] = b;
            }

            int answer = 1;
            int interview = arr[1];
            for (int i = 2; i <= n; i++) {
                if (interview > arr[i]) {
                    interview = arr[i];
                    answer++;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
