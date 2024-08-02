package io.github.ones1kk.study.book.do_it.week3.day02;

import java.util.ArrayList;

public class Class019 {

    private static boolean[] visited;
    private static ArrayList<Integer>[] graph;
    private static boolean isArrived;


    public static int resolve(int n, int k, int[][] arr) {
        isArrived = false;

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < k; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < k; i++) {
            int x = arr[i][0];
            int y = arr[i][1];

            graph[x].add(y);
            graph[y].add(x);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (isArrived) {
                break;
            }
        }

        return isArrived ? 1 : 0;
    }

    private static void dfs(int index, int depth) {
        if (depth == 5 || isArrived) {
            isArrived = true;
            return;
        }

        visited[index] = true;
        for (Integer i : graph[index]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
        visited[index] = false;
    }
}
