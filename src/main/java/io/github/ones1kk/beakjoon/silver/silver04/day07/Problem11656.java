package io.github.ones1kk.beakjoon.silver.silver04.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem11656 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            list.add(line.substring(i));
        }

        Collections.sort(list);

        for (String s : list) {
            bw.append(s).append("\n");
        }

        br.close();
        bw.close();
    }
}
