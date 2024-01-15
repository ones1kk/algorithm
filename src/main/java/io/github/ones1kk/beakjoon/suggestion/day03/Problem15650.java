package io.github.ones1kk.beakjoon.suggestion.day03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem15650 {

    static int n;
    static int m;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        arr = new int[m];

        dfs(0, 0);

        System.out.println(sb);

        br.close();
    }

    public static void dfs(int depth, int start) {
        if (depth == m) {
            for (int e : arr) {
                sb.append(e).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}
