package io.github.ones1kk.programers.level3;

import java.util.*;

public class Lesson132266 {

    private static List<List<Integer>> graph;
    private static int[] distances;
    private static final int MAX = Integer.MAX_VALUE;

    public static int[] solution(int n, int[][] roads, int[] sources, int destination) {
        graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int s = road[0];
            int e = road[1];

            graph.get(s).add(e);
            graph.get(e).add(s);
        }

        distances = new int[n + 1];
        Arrays.fill(distances, MAX);
        dijkstra(destination);

        int[] ans = new int[sources.length];
        for (int i = 0; i < sources.length; i++) {
            ans[i] = (distances[sources[i]] < MAX) ? distances[sources[i]] : -1;
        }
        return ans;
    }

    private static void dijkstra(int destination) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(destination);
        distances[destination] = 0;

        while (!qu.isEmpty()) {
            int currentNode = qu.poll();

            for (int i = 0; i < graph.get(currentNode).size(); i++) {
                int nextNode = graph.get(currentNode).get(i);
                if (distances[nextNode] > distances[currentNode] + 1) {
                    distances[nextNode] = distances[currentNode] + 1;
                    qu.add(nextNode);
                }
            }
        }
    }
}
