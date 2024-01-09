package io.github.ones1kk.beakjoon.series.greedy.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem13305 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];
        long[] distances = new long[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n - 1; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += (min * distances[i]);
        }

        System.out.println(sum);

        br.close();
    }
}
