package io.github.ones1kk.beakjoon.suggestion.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1789 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        int count = solve(n);

        System.out.println(count);

        br.close();
    }

    public static int solve(long num) {
        long start = 1;
        long sum = 0;
        int count = 0;
        while (sum <= num) {
            sum += start;
            start++;
            count++;
        }

        return --count;
    }
}
