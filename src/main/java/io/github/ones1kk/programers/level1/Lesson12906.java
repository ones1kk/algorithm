package io.github.ones1kk.programers.level1;

import java.util.Stack;

public class Lesson12906 {

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (!stack.isEmpty() && stack.peek() == i) {
                stack.pop();
                stack.push(i);
            } else {
                stack.push(i);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
