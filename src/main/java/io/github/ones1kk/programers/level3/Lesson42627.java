package io.github.ones1kk.programers.level3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Lesson42627 {

    public static int solution(int[][] jobs) {
        int answer = 0;
        int end = 0;
        int jobsIdx = 0;
        int count = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while (count < jobs.length) {
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
                pq.add(jobs[jobsIdx++]);
            }

            if (pq.isEmpty()) {
                end = jobs[jobsIdx][0];
            } else {
                int[] line = pq.poll();
                answer += line[1] + end - line[0];
                end += line[1];
                count++;
            }
        }

        return (int) Math.floor((double) answer / jobs.length);
    }
}
