package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Problem7785 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (set.contains(name)) {
                set.remove(name);
            } else {
                set.add(name);
            }

        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());

        for (String s : list) {
            bw.append(s).append("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
