package io.github.ones1kk.beakjoon.suggestion.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem10942 {

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        List<Node> list = new ArrayList<>();

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            list.add(new Node(a, b, cost));
        }

        Collections.sort(list);

        int sum = 0;
        parent = new int[v + 1];
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        for (Node node : list) {
            int a = node.a;
            int b = node.b;
            int cost = node.cost;

            if (find(a) == find(b)) {
                continue;
            }

            sum += cost;
            union(a, b);
        }

        System.out.println(sum);
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
        int a, b, cost;

        Node(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node a) {
            return Integer.compare(cost, a.cost);
        }
    }
}
