package io.github.ones1kk.beakjoon.silver.silver04.day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1120 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String first = st.nextToken();
        String second = st.nextToken();

        int length1 = first.length();
        int length2 = second.length();

        int answer = Integer.MAX_VALUE;

        int p1 = 0;
        int p2 = length1;
        while (p2 <= length2) {
            StringBuilder source = new StringBuilder();
            for (int i = p1; i < p2; i++) {
                source.append(second.charAt(i));
                if (i == p2 - 1) {
                    int count = check(first, source.toString());
                    answer = Math.min(answer, count);
                }
            }
            p1++;
            p2++;
        }

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }

    private static int check(String second, String source) {
        int result = 0;
        for (int i = 0; i < second.length(); i++) {
            if (second.charAt(i) != source.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
