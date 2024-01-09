package io.github.ones1kk.beakjoon.series.greedy.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10162 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] times = {300, 60, 10};
        int[] answer = new int[3];

        int time = Integer.parseInt(br.readLine());
        if (time % times[2] != 0) {
            System.out.println(-1);
            return;
        }

        while (time != 0) {
            for (int i = 0; i < 3; i++) {
                int num = times[i];
                int count = time / num;
                if (count > 0) {
                    time -= num * count;
                    answer[i] = count;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : answer) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);

        br.close();
    }
}
