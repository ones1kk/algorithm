package io.github.ones1kk.beakjoon.silver.silver04.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1940 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;
        int answer = 0;
        while(start < end) {
            if(arr[start]+arr[end] < m) {
                start++;
            } else if (arr[start]+arr[end] > m) {
                end--;
            } else {
                answer++;
                start++;
                end--;
            }
        }

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
