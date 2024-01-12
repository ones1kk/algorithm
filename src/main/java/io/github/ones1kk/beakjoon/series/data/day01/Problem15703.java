package io.github.ones1kk.beakjoon.series.data.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem15703 {

    public static void fail(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int e = Integer.parseInt(st.nextToken());
            arr[i] = e;
        }

        Arrays.sort(arr, (a1, a2) -> Integer.compare(a2, a1));

        int left = 0;
        int right = n - 1;
        int answer = 0;
        while (left <= right) {
            int val = arr[left];
            for (int i = 0; i < val; i++) {
                if (right > left) {
                    right--;
                } else {
                    break;
                }
            }
            left++;
            answer++;
        }

        System.out.println(answer);

        br.close();
    }
}
