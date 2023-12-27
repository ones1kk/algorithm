package io.github.ones1kk.beakjoon.dps.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11724 {

    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] graph = new boolean[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i, visited, graph, n);
                answer++;
            }

        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

    private static void dfs(int idx, boolean[] visited, boolean[][] graph, int n) {
        visited[idx] = true;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i, visited, graph, n);
            }
        }
    }
}
