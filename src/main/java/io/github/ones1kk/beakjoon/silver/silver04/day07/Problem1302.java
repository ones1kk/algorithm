package io.github.ones1kk.beakjoon.silver.silver04.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Problem1302 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String answer = "";
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (value > max) {
                max = value;
                answer = key;
            } else if (value == max) {
                answer = answer.compareTo(key) > 0 ? key : answer;
            }
        }

        bw.append(answer);

        br.close();
        bw.close();
    }
}
