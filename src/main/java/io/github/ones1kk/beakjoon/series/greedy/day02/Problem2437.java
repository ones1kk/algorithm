package io.github.ones1kk.beakjoon.series.greedy.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2437 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 1;
        for (int i = 0; i < n; i++) {
            if (answer + 1 < arr[i]) {
                break;
            }
            answer += arr[i];
        }

        System.out.println(answer);

        br.close();
    }
}
