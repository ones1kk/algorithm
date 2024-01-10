package io.github.ones1kk.beakjoon.series.greedy.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem4796 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 1;
        while (true) {
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if (l == 0 && p == 0 && v == 0) {
                break;
            }

            int divide = v / p;
            int remainder = v % p;
            answer += divide * l;

            remainder = Math.min(remainder, l);
            answer += remainder;

            sb.append(String.format("Case %s: %d", count, answer)).append("\n");
            count++;
        }

        System.out.println(sb);

        br.close();
    }
}
