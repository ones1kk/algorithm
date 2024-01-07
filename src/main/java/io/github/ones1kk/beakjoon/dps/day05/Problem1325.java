package io.github.ones1kk.beakjoon.dps.day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem1325 {

    static int[] ANSWER;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer>[] map = new ArrayList[n + 1];
        ANSWER = new int[n + 1];
        boolean[] visited;

        for (int i = 1; i <= n; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a].add(b);
        }

        int idx = 1;
        while (idx != n + 1) {
            visited = new boolean[n + 1];
            if (!visited[idx]) {
                dfs(idx, map, visited);
            }
            idx++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            max = Math.max(ANSWER[i], max);
        }

        for (int i = 1; i <= n; i++) {
            if (max == ANSWER[i]) {
                bw.append(String.valueOf(i)).append(" ");
            }
        }

        br.close();
        bw.close();
    }

    private static void dfs(int idx, List<Integer>[] map, boolean[] visited) {
        visited[idx] = true;
        for (int i = 0; i < map[idx].size(); i++) {
            int next = map[idx].get(i);
            if (!visited[next]) {
                dfs(next, map, visited);
                ANSWER[next]++;
            }
        }
    }
}
