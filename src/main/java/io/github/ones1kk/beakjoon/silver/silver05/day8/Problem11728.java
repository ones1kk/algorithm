package io.github.ones1kk.beakjoon.silver.silver05.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11728 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] answer = new int[n + m];
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        int idx = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer[idx++] = arr1[p1++];
            } else {
                answer[idx++] = arr2[p2++];
            }
        }

        while (p1 < n) {
            answer[idx++] = arr1[p1++];
        }

        while (p2 < m) {
            answer[idx++] = arr2[p2++];
        }

        for (int i : answer) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
