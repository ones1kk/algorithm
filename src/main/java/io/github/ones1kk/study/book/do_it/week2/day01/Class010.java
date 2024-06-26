package io.github.ones1kk.study.book.do_it.week2.day01;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Class010 {

    public static long[] resolve(long[] arr, int count) {
        Deque<Node> deque = new LinkedList<>();
        List<Long> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            long num = arr[i];
            while (!deque.isEmpty() && deque.getLast().value > num) {
                deque.removeLast();
            }
            deque.addLast(new Node(num, i));

            if (deque.getFirst().index <= i - count) {
                deque.removeFirst();
            }

            answer.add(deque.getFirst().value);
        }

        return answer.stream()
                .mapToLong(Long::valueOf)
                .toArray();
    }

    static class Node {
        private final long value;
        private final long index;

        public Node(long value, long index) {
            this.value = value;
            this.index = index;
        }
    }

}
