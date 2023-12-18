package io.github.ones1kk.beakjoon.silver.silver04.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int weight = Integer.parseInt(br.readLine());
        int answer = 0;

        while (weight > 0) {
            if (weight % 5 == 0) {
                answer += weight / 5;
                System.out.println(answer);
                return;
            }
            if (weight < 3) {
                System.out.println(-1);
                return;
            }
            weight -= 3;
            answer++;
        }

        System.out.println(answer);
        br.close();
    }
}
