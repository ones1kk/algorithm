package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1439 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[2];
        String str = br.readLine();
        char start = str.charAt(0);
        arr[Character.getNumericValue(start)]++;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
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
