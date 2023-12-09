package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1010 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if (left == right) {
                bw.append("1").append("\n");
            } else {
                double factorial = factorial(right);
                double factorial1 = factorial(left);
                double factorial2 = factorial(right - left);

                double a = factorial2 * factorial1;

                long result = (long) Math.ceil((factorial / a));
                bw.append(String.valueOf((result))).append("\n");
            }
        }

        br.close();
        bw.close();
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
