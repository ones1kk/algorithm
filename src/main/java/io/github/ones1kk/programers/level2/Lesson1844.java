package io.github.ones1kk.programers.level2;

public class Lesson1844 {

    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    static int answer = Integer.MAX_VALUE;

    static int[][] count;

    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] graph = new boolean[n + 2][m + 2];
        boolean[][] visited = new boolean[n + 2][m + 2];
        count = new int[n + 2][m + 2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                graph[i][j] = maps[i - 1][j - 1] == 1;
            }
        }

        dfs(1, 1, graph, visited, n, m);

        return answer == Integer.MAX_VALUE ? -1 : answer + 1;
    }

    private static void dfs(int y, int x, boolean[][] graph, boolean[][] visited, int n, int m) {
        visited[y][x] = true;
        if (count[y][x] > answer) {
            return;
        }
        if (y == n && x == m) {
            answer = Math.min(answer, count[y][x]);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (graph[newY][newX] && !visited[newY][newX]) {
                count[newY][newX] = count[y][x] + 1;
                dfs(newY, newX, graph, visited, n, m);
                visited[newY][newX] = false;
            }
        }
    }


}
