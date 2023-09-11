package io.github.ones1kk.programers.level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Lesson12927 {


    // TODO 다시 볼 것
    public static long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            pq.offer(work);
        }

        if (pq.stream().mapToLong(it -> it).sum() < n) {
            return 0;
        }

        while (n > 0) {
            int i = pq.poll();
            pq.offer(i - 1);
            n--;
        }

        while (!pq.isEmpty()) {
            answer += Math.pow(pq.poll(), 2);
        }

        return answer;
    }
}
