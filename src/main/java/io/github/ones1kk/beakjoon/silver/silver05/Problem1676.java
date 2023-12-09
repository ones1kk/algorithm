package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1676 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }
        System.out.println(count);
    }

    public static void fail(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n < 5) {
            System.out.println(0);
            return;
        }
        long[] dp = new long[n + 1];

        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }
        String strNum = String.valueOf(dp[n]);
        StringBuilder sb = new StringBuilder();
        for (int i = strNum.length() - 1; i >= 0; i--) {
            if (strNum.charAt(i) == '0') {
                sb.append(strNum.charAt(i));
            } else {
                break;
            }
        }
        System.out.println(sb.length());
        br.close();
    }

}
