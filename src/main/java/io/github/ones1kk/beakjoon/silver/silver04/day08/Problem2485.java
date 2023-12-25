package io.github.ones1kk.beakjoon.silver.silver04.day08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2485 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        int[] arr = new int[n];
        int minGap = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i > 0) {
                int val = arr[i] - arr[i - 1];
                minGap = gcd(val, minGap);
            }
        }
        int answer = 0;
        for (int i = 1; i < n; ++i) {
            answer += ((arr[i] - arr[i - 1]) / minGap) - 1;
        }

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
