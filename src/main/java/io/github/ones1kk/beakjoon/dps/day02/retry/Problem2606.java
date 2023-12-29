package io.github.ones1kk.beakjoon.dps.day02.retry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2606 {

    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[n + 1];
        boolean[][] graph = new boolean[n + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(1, visited, graph, n);

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }

    private static void dfs(int idx, boolean[] visited, boolean[][] graph, int n) {
        visited[idx] = true;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) {
                answer++;
                dfs(i, visited, graph, n);
            }
        }
    }
}
