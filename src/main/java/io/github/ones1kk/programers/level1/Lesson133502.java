package io.github.ones1kk.programers.level1;

import java.util.Stack;

public class Lesson133502 {

    public static int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i : ingredient) {
            stack.push(i);
            int size = stack.size();
            if (size >= 4) {
                if (stack.get(size - 1) == 1
                        && stack.get(size - 2) == 3
                        && stack.get(size - 3) == 2
                        && stack.get(size - 4) == 1) {
                    runPop(stack, 4);
                    answer++;
                }
            }
        }

        return answer;
    }

    private static void runPop(Stack<?> stack, int count) {
        for (int i = 0; i < count; i++) {
            stack.pop();
        }
    }

}
