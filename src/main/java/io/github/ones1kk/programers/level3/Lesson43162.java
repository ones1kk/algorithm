package io.github.ones1kk.programers.level3;

public class Lesson43162 {

    public static int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[][] graph = new boolean[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i + 1][j + 1] = computers[i][j] == 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, n);
                answer++;
            }
        }


        return answer;
    }

    private static void dfs(int idx, boolean[][] graph, boolean[] visited, int n) {
        visited[idx] = true;
        for (int i = 1; i <= n; i++) {
            if (graph[idx][i] && !visited[i]) {
                dfs(i, graph, visited, n);
            }
        }
    }
}
