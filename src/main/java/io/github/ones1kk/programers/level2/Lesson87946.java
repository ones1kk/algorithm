package io.github.ones1kk.programers.level2;

public class Lesson87946 {

    private static int answer = 0;

    public static int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, k, 0);
        return answer;
    }

    public static void dfs(int[][] dungeons, boolean[] visited, int k, int depth) {
        for (int i = 0; i < dungeons.length; i++) {
            int first = dungeons[i][0];
            int second = dungeons[i][1];
            if (!visited[i] && k >= first) {
                visited[i] = true;
                dfs(dungeons, visited, k - second, depth + 1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }

}
