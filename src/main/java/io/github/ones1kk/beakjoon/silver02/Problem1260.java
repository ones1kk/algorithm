package io.github.ones1kk.beakjoon.silver02;

public class Problem1260 {

    static boolean[] visited;
    static boolean[][] graph;
    static int N;

    public static void main(String[] args) {
        solution(4, 5, 1, "12 13 14 24 34'");
    }

    public static void solution(int node, int line, int start, String info) {
        visited = new boolean[line + 1];
        graph = new boolean[line + 1][line + 1];
        N = node;

        String[] split = info.split(" ");
        for (String s : split) {
            int row = Character.getNumericValue(s.charAt(0));
            int col = Character.getNumericValue(s.charAt(1));
            graph[row][col] = true;
            graph[col][row] = true;
        }

        dfs(start);
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        System.out.println(idx);
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
