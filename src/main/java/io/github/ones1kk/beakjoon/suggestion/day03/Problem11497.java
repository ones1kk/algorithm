package io.github.ones1kk.beakjoon.suggestion.day03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11497 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int e = Integer.parseInt(st.nextToken());
                arr[i] = e;
            }

            Arrays.sort(arr);

            int[] answer = new int[n];
            int left = 0;
            int right = n - 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    answer[left] = arr[i];
                    left++;
                } else {
                    answer[right] = arr[i];
                    right--;
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (i < n - 1) {
                    int current = answer[i];
                    int next = answer[i + 1];

                    max = Math.max(max, Math.abs(current - next));
                }
            }
            sb.append(max).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
