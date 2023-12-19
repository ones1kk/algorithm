package io.github.ones1kk.beakjoon.silver.silver04.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Problem1764 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            if (set.contains(line)) {
                list.add(line);
            }
        }

        Collections.sort(list);

        bw.append(String.valueOf(list.size())).append("\n");
        for (String s : list) {
            bw.append(s).append("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
