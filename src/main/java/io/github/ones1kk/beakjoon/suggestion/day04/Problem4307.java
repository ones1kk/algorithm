package io.github.ones1kk.beakjoon.suggestion.day04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem4307 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            int antCnt = Integer.parseInt(st.nextToken());

            int min = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < antCnt; j++) {
                st = new StringTokenizer(br.readLine());
                int ant = Integer.parseInt(st.nextToken());

                int antMin = Math.min(ant, length - ant);
                int antMax = Math.max(ant, length - ant);

                min = Math.max(min, antMin);
                max = Math.max(max, antMax);
            }
            System.out.println(min + " " + max);
        }
        br.close();
    }

}
