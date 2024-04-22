package io.github.ones1kk.beakjoon.again.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int weight = Integer.parseInt(br.readLine());

        int answer = solve(weight);

        System.out.println(answer);

        br.close();
    }


    public static int solve(int weight) {
        int answer = 0;
        while (weight > 0) {
            if (weight % 5 == 0) {
                answer += weight / 5;
                return answer;
            }
            if (weight < 3) {
                return -1;
            }
            weight -= 3;
            answer++;
        }

        return answer;
    }
}
