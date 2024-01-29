package io.github.ones1kk.programers.level3;


import java.util.PriorityQueue;

public class Lesson12987 {

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        PriorityQueue<Integer> q1 = new PriorityQueue<>(a.length);
        PriorityQueue<Integer> q2 = new PriorityQueue<>(a.length);

        for (int i = 0; i < a.length; i++) {
            q1.offer(a[i]);
            q2.offer(b[i]);
        }

        while (!q2.isEmpty()) {
            Integer p1 = q1.peek();
            Integer p2 = q2.poll();
            if (p2 > p1) {
                answer++;
                q1.poll();
            }
        }

        return answer;
    }
}
