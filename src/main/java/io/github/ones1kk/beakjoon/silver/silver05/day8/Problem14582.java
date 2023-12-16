package io.github.ones1kk.beakjoon.silver.silver05.day8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14582 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        boolean isWin = false;
        int j = 0;
        int s = 0;
        for (int i = 0; i < 9; i++) {
            j += Integer.parseInt(st1.nextToken());
            if (j > s) {
                isWin = true;
            }

            s += Integer.parseInt(st2.nextToken());
            if (j > s) {
                isWin = true;
            }

        }
        if (j < s && isWin) {
            bw.append("Yes");
        } else {
            bw.append("No");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
