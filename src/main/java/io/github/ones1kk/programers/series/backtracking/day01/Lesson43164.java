package io.github.ones1kk.programers.series.backtracking.day01;

import java.util.*;

public class Lesson43164 {
    static boolean[] visited;
    static List<String> list;

    public static String[] solution(String[][] tickets) {
        list = new ArrayList<>();
        visited = new boolean[tickets.length];

        dfs(tickets, "ICN", "ICN", 1);
        Collections.sort(list);
        return list.get(0).split(" ");
    }

    public static void dfs(String[][] tickets, String current, String sequence, int depth) {
        if (depth == tickets.length + 1) {
            list.add(sequence);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(current) && !visited[i]) {
                visited[i] = true;
                dfs(tickets, tickets[i][1], sequence + " " + tickets[i][1], depth + 1);
                visited[i] = false;
            }
        }
    }
}
