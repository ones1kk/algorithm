package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Problem1181 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        list.sort((a1, a2) -> {
            if (a1.length() == a2.length()) {
                return a1.compareTo(a2);
            }
            return Integer.compare(a1.length(), a2.length());
        });

        Set<String> set = new LinkedHashSet<>(list);
        for (String s : set) {
            bw.append(s).append("\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }


}
