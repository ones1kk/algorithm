package io.github.ones1kk.beakjoon.silver.silver04.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem10816 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(st.nextToken());
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            Integer value = map.getOrDefault(key, 0);
            answer[i] = value;
        }

        for (int i : answer) {
            bw.append(String.valueOf(i)).append(" ");
        }

        bw.flush();


        br.close();
        bw.close();
    }
}
