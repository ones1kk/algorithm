package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String next = br.readLine();
            if (check(next)) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }

    private static boolean check(String next) {
        char[] charArray = next.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            boolean end = false;
            for (int j = i + 1; j < length; j++) {
                char t = charArray[j];
                if (end && c == t) {
                    return false;
                }
                if (c != t) {
                    end = true;
                }
            }
        }
        return true;
    }

}


