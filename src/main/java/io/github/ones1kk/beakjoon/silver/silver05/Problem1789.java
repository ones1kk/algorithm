package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1789 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int count = 0;
        long sum = 0;
        long i = 0;
        while (true) {
            sum += ++i;
            if (sum > n) {
                break;
            }
            count++;
        }
        System.out.println(count);
        br.close();
    }
}
