package io.github.ones1kk.programers.level2;

import java.util.Stack;

public class Lesson12973 {

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            int size = stack.size();

            if (size >= 2) {
                if (stack.get(size - 1) == stack.get(size - 2)) {
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
