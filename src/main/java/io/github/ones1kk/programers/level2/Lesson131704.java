package io.github.ones1kk.programers.level2;

import java.util.Stack;

public class Lesson131704 {

    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int orderIdx = 0;
        for (int i = 1; i <= order.length; i++) {
            if (i != order[orderIdx]) {
                stack.push(i);
            } else {
                answer++;
                orderIdx++;
            }

            while (!stack.isEmpty() && stack.peek() == order[orderIdx]) {
                stack.pop();
                answer++;
                orderIdx++;
            }
        }

        return answer;
    }
}
