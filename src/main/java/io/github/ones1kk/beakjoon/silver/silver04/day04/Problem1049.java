package io.github.ones1kk.beakjoon.silver.silver04.day04;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1049 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int minUnitPrice = Integer.MAX_VALUE;
        int minSetPrice = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int setPrice = Integer.parseInt(st.nextToken());
            int unitPrice = Integer.parseInt(st.nextToken());

            minUnitPrice = Math.min(minUnitPrice, unitPrice);
            minSetPrice = Math.min(minSetPrice, setPrice);
        }

        int unit = minUnitPrice * n;
        int set;
        int answer;

        int set1 = n / 6 * minSetPrice;
        if (n % 6 != 0) {
            set1 += n % 6 * minUnitPrice;
        }

        int set2 = n / 6 * minSetPrice + minSetPrice;

        set = Math.min(set1, set2);
        answer = Math.min(set, unit);


        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
