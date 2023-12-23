package io.github.ones1kk.beakjoon.silver.silver04.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem18110 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int average = (int) Math.round(n * 0.15);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int sum = 0;
        int count = n - (average * 2);
        for (int i = average; i < n - average; i++) {
            sum += list.get(i);
        }

        bw.append(String.valueOf(Math.round((double)sum / count)));

        br.close();
        bw.close();
    }
}
