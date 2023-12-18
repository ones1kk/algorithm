package io.github.ones1kk.beakjoon.silver.silver04.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11047 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (money == 0) {
                break;
            }
            int coin = arr[i];
            if (coin <= money) {
                int count = money / coin;
                money -= coin * count;
                answer += count;
            }

        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
