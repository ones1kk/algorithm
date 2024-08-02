package io.github.ones1kk.study.book.do_it.week3.day01;

public class Class018 {

    private static boolean[] visited;
    private static boolean[][] graph;
    private static int N;

    public static int resolve(int n, int k, int[][] arr) {
        int answer = 0;
        N = n;
        visited = new boolean[n + 1];
        graph = new boolean[n + 1][n + 1];

        for (int i = 0; i < k; i++) {
            int x = arr[i][0];
            int y = arr[i][1];

            graph[x][y] = true;
            graph[y][x] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }

    private static void dfs(int depth) {
        if (visited[depth]) {
            return;
        }
        visited[depth] = true;
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[depth][i]) {
                dfs(i);
            }
        }
    }

}
