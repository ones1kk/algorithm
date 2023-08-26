package io.github.ones1kk.programers.level2;

import java.util.*;
import java.util.stream.Collectors;

public class Lesson118667 {

    public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Double> q1 = Arrays.stream(queue1).mapToDouble(it -> (double) it).boxed().collect(Collectors.toCollection(LinkedList::new));
        Queue<Double> q2 = Arrays.stream(queue2).mapToDouble(it -> (double) it).boxed().collect(Collectors.toCollection(LinkedList::new));

        long sum1 = 0;
        long sum2 = 0;

        for (Double num : q1) {
            sum1 += num;
        }

        for (Double num : q2) {
            sum2 += num;
        }

        while (sum1 != sum2) {
            answer++;
            if (sum1 > sum2) {
                Double poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.offer(poll);
            } else {
                Double poll = q2.poll();
                sum1 += poll;
                sum2 -= poll;
                q1.offer(poll);
            }

            if (answer > (q1.size() + q2.size()) * 2) {
                return -1;
            }

        }

        return answer;
    }
}
