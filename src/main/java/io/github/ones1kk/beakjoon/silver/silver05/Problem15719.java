package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15719 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[m + 2];
        for (int i = 0; i < m; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (arr[value] == 1) {
                System.out.println(value);
                break;
            }
            arr[value]++;
        }

        br.close();
        bw.close();
    }
}
