package io.github.ones1kk.programers.level1;

import java.util.Stack;

public class Lesson64061 {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();

        for (int value : moves) {
            int move = value - 1;
            int pick = 0;
            for (int j = 0; j < board.length; j++) {
                pick = board[j][move];
                if (pick != 0) {
                    board[j][move] = 0;
                    break;
                }

            }

            if (pick != 0) {
                bucket.push(pick);
                int size = bucket.size();
                if (size >= 2) {
                    if (bucket.peek().equals(bucket.get(size - 2))) {
                        pop(bucket, 2);
                        answer++;
                    }
                }
            }
        }

        return answer * 2;
    }

    private static void pop(Stack<?> stack, int count) {
        for (int i = 0; i < count; i++) {
            stack.pop();
        }
    }

}
