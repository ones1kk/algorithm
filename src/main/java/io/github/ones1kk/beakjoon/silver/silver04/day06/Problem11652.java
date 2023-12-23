package io.github.ones1kk.beakjoon.silver.silver04.day06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Problem11652 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long key = Long.parseLong(br.readLine());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        Long minKey = Long.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Long key : map.keySet()) {
            Integer value = map.get(key);
            if (value > max) {
                max = value;
                minKey = key;
            } else if (value == max) {
                minKey = Math.min(minKey, key);
            }
        }
        bw.append(String.valueOf(minKey));

        br.close();
        bw.close();
    }
}
