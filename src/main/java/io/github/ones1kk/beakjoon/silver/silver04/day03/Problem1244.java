package io.github.ones1kk.beakjoon.silver.silver04.day03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem1244 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Boolean> map = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            String val = st.nextToken();
            if (val.equals("1")) {
                map.put(i, true);
            } else {
                map.put(i, false);
            }
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String sex = st.nextToken(); // 1 남, 2 여
            int command = Integer.parseInt(st.nextToken());
            if (sex.equals("1")) {
                int num = command;
                while (map.containsKey(command)) {
                    map.put(command, !map.get(command));
                    command += num;
                }
            } else {
                int idx = 1;
                int first;
                int last;
                while (true) {
                    first = command - idx;
                    last = command + idx;
                    if (map.containsKey(first) && map.containsKey(last)) {
                        if (map.get(first).equals(map.get(last))) {
                            map.put(first, !map.get(first));
                            map.put(last, !map.get(last));
                            idx++;
                            continue;
                        }
                    }
                    map.put(command, !map.get(command));
                    break;
                }
            }

        }

        int count = 0;
        for (Integer i : map.keySet()) {
            Boolean value = map.get(i);
            if (value) {
                bw.append("1").append(" ");
            } else {
                bw.append("0").append(" ");
            }
            count++;
            if (count % 20 == 0) {
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }

}
