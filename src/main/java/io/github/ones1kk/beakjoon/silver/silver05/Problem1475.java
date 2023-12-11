package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1475 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int[] arr = new int[10];
        for (char c : n.toCharArray()) {
            int numeric = Character.getNumericValue(c);
            arr[numeric]++;
        }

        int sum = (int) Math.ceil((double) (arr[6] + arr[9]) / 2);
        arr[6] = sum;
        arr[9] = sum;

        Arrays.sort(arr);

        System.out.println(arr[9]);

        br.close();
    }
}
