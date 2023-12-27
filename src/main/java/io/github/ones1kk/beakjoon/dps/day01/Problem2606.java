package io.github.ones1kk.beakjoon.dps.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2606 {

    static int n;
    static int m;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        graph = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(1);

        bw.write(String.valueOf(answer - 1));

        br.close();
        bw.close();
    }

    public static void dfs(int idx) {
        visited[idx] = true;
        answer++;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
