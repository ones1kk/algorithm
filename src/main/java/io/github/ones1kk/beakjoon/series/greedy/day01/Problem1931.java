package io.github.ones1kk.beakjoon.series.greedy.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1931 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i][0] = start;
            arr[i][1] = end;
        }

        Arrays.sort(arr, (a1, a2) -> {
            if (a1[1] == a2[1]) {
                return Integer.compare(a1[0], a2[0]);
            }
            return Integer.compare(a1[1], a2[1]);
        });

        int count = 0;
        int endTime = 0;
        for (int i = 0; i < n; i++) {
            if (endTime <= arr[i][0]) {
                endTime = arr[i][1];
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }

}
