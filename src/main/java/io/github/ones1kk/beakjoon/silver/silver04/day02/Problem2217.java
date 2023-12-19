package io.github.ones1kk.beakjoon.silver.silver04.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2217 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(br.readLine());
            return;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int max = 0;
        int count = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            max = Math.max(max, list.get(i) * count);
            count++;
        }

        System.out.println(max);

        br.close();
        bw.close();
    }
}
