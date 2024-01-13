package io.github.ones1kk.beakjoon.suggestion.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1439 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int[] arr = new int[2];
        char start = line.charAt(0);
        for (int i = 1; i < line.length(); i++) {
            char c = line.charAt(i);
            if (start != c) {
                if (c == '0') {
                    arr[0]++;
                } else {
                    arr[1]++;
                }
                start = c;
            }
        }

        System.out.println(Math.min(arr[0], arr[1]));

        br.close();
    }
}
