package io.github.ones1kk.beakjoon.dps.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Problem24480 {

    static int[] answer;
    static int order = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n + 1];
        answer = new int[n + 1];

        List<Integer>[] graph = new ArrayList[n + 1];
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
            graph[i].sort(Comparator.reverseOrder());
        }

        dfs(r, visited, graph);

        for (int i = 1; i <= n; i++) {
            bw.append(String.valueOf(answer[i])).append("\n");
        }

        br.close();
        bw.close();
    }

    private static void dfs(int idx, boolean[] visited, List<Integer>[] graph) {
        visited[idx] = true;
        answer[idx] = order;
        order++;
        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if (!visited[next]) {
                dfs(next, visited, graph);
            }
        }
    }
}
