package io.github.ones1kk.beakjoon.suggestion.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem1922 {

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        parent = new int[n + 1];

        List<Node> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            list.add(new Node(x, y, cost));
        }

        list.sort((l1, l2) -> {
            if (l1.cost == l2.cost) {
                return Integer.compare(l1.x, l2.x);
            }
            return Integer.compare(l1.cost, l2.cost);
        });

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        int answer= 0;
        for (Node node : list) {
            int a = node.x;
            int b = node.y;
            int cost = node.cost;

            if (find(a) == find(b)) {
                continue;
            }
            answer += cost;

            union(a, b);
        }

        System.out.println(answer);

        br.close();
    }

    static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        else {
            return find(parent[a]);
        }
    }

    static void union(int a, int b) {
        int x = find(a);
        int y = find(b);

        if (x != y) {
            parent[y] = x;
        }
    }

    static class Node implements Comparable<Node> {
        int x, y, cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
}
