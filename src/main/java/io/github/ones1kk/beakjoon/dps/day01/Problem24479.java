package io.github.ones1kk.beakjoon.dps.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem24479 {

    static int[] answer;
    static int order = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        List<Integer>[] graph = new ArrayList[n + 1];
        answer = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(r, visited, graph, n);

        for (int i = 1; i <= n; i++) {
            bw.append(String.valueOf(answer[i])).append("\n");
        }

        br.close();
        bw.close();
    }

    private static void dfs(int idx, boolean[] visited, List<Integer>[] graph, int n) {
        visited[idx] = true;
        answer[idx] = order;
        order++;
        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if (!visited[next]) {
                dfs(next, visited, graph, n);
            }
        }
    }
}
