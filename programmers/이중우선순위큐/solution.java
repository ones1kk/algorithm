// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42628

import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();

        for (String operation : operations) {
            StringTokenizer st = new StringTokenizer(operation);
            String command = st.nextToken();
            int number = Integer.parseInt(st.nextToken());

            if (command.equals("I")) {
                maxQ.offer(number);
                minQ.offer(number);
            } else {
                if (!minQ.isEmpty() && !maxQ.isEmpty()) {
                    if (number == 1) {
                        Integer max = maxQ.poll();
                        minQ.remove(max);
                    } else {
                        Integer min = minQ.poll();
                        maxQ.remove(min);
                    }
                }

            }
        }

        int[] answer = new int[2];
        if (!minQ.isEmpty() && !maxQ.isEmpty()) {
            answer[0] = maxQ.poll();
            answer[1] = minQ.poll();
        }

        return answer;
    }
}