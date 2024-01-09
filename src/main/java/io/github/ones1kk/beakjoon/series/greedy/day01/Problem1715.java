package io.github.ones1kk.beakjoon.series.greedy.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1715 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        PriorityQueue<Long> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add(Long.parseLong(br.readLine()));
        }

        if (q.size() == 1) {
            System.out.println(0);
            return;
        }

        while (q.size() != 1 && !q.isEmpty()) {
            long temp = q.poll() + q.poll();
            q.add(temp);
            answer += temp;
        }

        System.out.println(answer);

        br.close();
    }

    // 메모리 초과
    public static void fail(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Long> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(br.readLine()));
        }

        Collections.sort(list);
        int answer = 0;
        for (int i = 0; i < n; i++) {
            long current = list.get(i);
            if (i < n - 1) {
                long next = list.get(i + 1);
                long candidate = current + next;
                list.set(i + 1, candidate);
                answer += list.get(i + 1);
            }
            Collections.sort(list);
        }

        System.out.println(answer);

        br.close();
    }
}
