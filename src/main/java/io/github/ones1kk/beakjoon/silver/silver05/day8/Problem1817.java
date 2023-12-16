package io.github.ones1kk.beakjoon.silver.silver05.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1817 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int m = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(br.readLine());

        int box = 1;
        int weight = 0;
        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(stringTokenizer.nextToken());
            weight += element;
            if (weight > m) {
                box++;
                weight = element;
            }
        }
        System.out.println(box);

        br.close();
    }
}
