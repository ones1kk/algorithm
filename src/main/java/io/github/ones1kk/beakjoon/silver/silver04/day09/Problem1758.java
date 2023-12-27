package io.github.ones1kk.beakjoon.silver.silver04.day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Problem1758 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> people = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int tip = Integer.parseInt(br.readLine());
            people.add(tip);
        }

        people.sort(Comparator.reverseOrder());

        long answer = 0;
        for (int i = 0; i < n; i++) {
            int total = people.get(i) - (i);
            if(total <= 0) {
                break;
            }
            answer += total;
        }

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }

}
