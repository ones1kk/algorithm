package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2941 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();
        for (String s : arr) {
            if (str.contains(s)) {
                str = str.replace(s, " ");
            }
        }
        System.out.println(str.length());
        br.close();
    }
}