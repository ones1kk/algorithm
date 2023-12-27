package io.github.ones1kk.beakjoon.dps.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2644 {

    static int start;
    static int end;
    static int answer = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[n + 1];
        boolean[][] graph = new boolean[n + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(start, visited, graph, n, 0);

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }

    private static void dfs(int idx, boolean[] visited, boolean[][] graph, int n, int count) {
        visited[idx] = true;
        if (idx == end) {
            answer = count;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i, visited, graph, n, count + 1);
            }
        }
    }
}
