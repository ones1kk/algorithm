package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1193 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            bw.write("1/1");
        }

        int[] dp = new int[n + 1];
        if (n > 1) {
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + i;
                if (dp[i] >= n) {
                    if (i % 2 == 0) {
                        int left = 1;
                        int right = i;
                        for (int j = (dp[i - 1] + 1); j <= dp[i]; j++) {
                            if (j == n) {
                                bw.write(left + "/" + right);
                                break;
                            }
                            left++;
                            right--;
                        }

                    } else {
                        int left = i;
                        int right = 1;
                        for (int j = (dp[i - 1] + 1); j <= dp[i]; j++) {
                            if (j == n) {
                                bw.write(left + "/" + right);
                                break;
                            }
                            left--;
                            right++;
                        }
                    }
                    break;
                }
            }
        }

        br.close();
        bw.close();
    }
}
