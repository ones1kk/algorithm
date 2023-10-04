package io.github.ones1kk.programers.level3;

import java.util.LinkedList;
import java.util.Queue;

public class Lesson49189 {

    public static int solution(int n, int[][] edge) {
        boolean[][] graph = new boolean[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int[] ints : edge) {
            int x = ints[0];
            int y = ints[1];

            graph[x][y] = true;
            graph[y][x] = true;
        }

        return bfs(visited, graph);
    }

    public static int bfs(boolean[] visited, boolean[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        int size = 0;

        while (!queue.isEmpty()) {
            size = queue.size();

            for (int i = 0; i < size; i++) {
                int poll = queue.poll();

                for (int j = 1; j < visited.length; j++) {
                    if (!visited[j] && graph[poll][j]) {
                        visited[j] = true;
                        queue.add(j);
                    }
                }
            }
        }

        return size;
    }

}
