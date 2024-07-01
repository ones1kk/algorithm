package io.github.ones1kk.study.book.do_it.week2.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Class013 {

    public static int[] resolve(int[] arr) {
        int length = arr.length;
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> {
            int first = Math.abs(a);
            int second = Math.abs(b);
            if (first == second) {
                return Integer.compare(a, b);
            }
            return Integer.compare(first, second);
        });

        List<Integer> answer = new ArrayList<>(length);

        for (int num : arr) {
            if (num == 0) {
                if (heap.isEmpty()) {
                    answer.add(0);
                } else {
                    answer.add(heap.poll());
                }
            } else {
                heap.add(num);
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
