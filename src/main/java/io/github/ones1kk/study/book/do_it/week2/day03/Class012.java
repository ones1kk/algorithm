package io.github.ones1kk.study.book.do_it.week2.day03;

import java.util.Stack;

public class Class012 {

    public static int[] resolve(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int length = arr.length;
        int[] answer = new int[length];

        stack.push(0);

        for (int i = 0; i < length; i++) {
            int num = arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] < num) {
                answer[stack.pop()] = num;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

}
