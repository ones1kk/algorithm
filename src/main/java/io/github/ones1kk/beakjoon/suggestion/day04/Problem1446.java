package io.github.ones1kk.beakjoon.suggestion.day04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1446 {

    static class Road {
        int start, end, dist;

        public Road(int start, int end, int dist) {
            this.start = start;
            this.end = end;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        List<Road> roads = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            if (to > d) continue;
            if (to - from <= dist) continue;
            roads.add(new Road(from, to, dist));
        }

        roads.sort((l1, l2) -> {
            if (l1.start == l2.start) {
                return Integer.compare(l1.end, l2.end);
            }
            return Integer.compare(l1.start, l2.start);
        });

        int move = 0;
        int[] dp = new int[d + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int idx = 0;
        while (move < d) {
            if (idx < roads.size()) {
                Road sp = roads.get(idx);
                if (move == sp.start) {
                    dp[sp.end] = Math.min(dp[move] + sp.dist, dp[sp.end]);
                    idx++;
                } else {
                    dp[move + 1] = Math.min(dp[move + 1], dp[move] + 1);
                    move++;
                }
            } else {
                dp[move + 1] = Math.min(dp[move + 1], dp[move] + 1);
                move++;
            }
        }
        System.out.println(dp[d]);
    }

}
