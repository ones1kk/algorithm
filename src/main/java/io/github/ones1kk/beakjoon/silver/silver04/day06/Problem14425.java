package io.github.ones1kk.beakjoon.silver.silver04.day06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Problem14425 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                answer++;
            }
        }

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
