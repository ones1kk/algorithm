package io.github.ones1kk.beakjoon.dps.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem11725 {
    static int[] answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer>[] graph = new ArrayList[n + 1];
        boolean[] visited = new boolean[n + 1];
        answer = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1, visited, graph);

        for (int i = 2; i <= n; i++) {
            bw.append(String.valueOf(answer[i])).append("\n");
        }

        br.close();
        bw.close();
    }

    private static void dfs(int idx, boolean[] visited, List<Integer>[] graph) {
        visited[idx] = true;
        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if (!visited[next]) {
                answer[next] = idx;
                dfs(next, visited, graph);
            }
        }

    }
}
