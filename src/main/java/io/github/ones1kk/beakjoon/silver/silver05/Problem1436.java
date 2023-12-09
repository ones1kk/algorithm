package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1436 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int end = 666;
        int idx = 0;
        int n = Integer.parseInt(br.readLine());
        while (true) {
            if (String.valueOf(end).contains("666")) {
                idx++;
            }

            if (idx == n) {
                System.out.println(end);
                break;
            }
            end++;
        }
        br.close();
    }
}
