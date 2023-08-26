// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131704

import java.util.*;

class Solution {
    public int solution(int[] order) {
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