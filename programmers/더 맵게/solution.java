// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42626

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : scoville) {
            heap.add(i);
        }

        int min = heap.peek();
        while (K > min && heap.size() > 1) {
            answer++;
            int first = heap.poll();
            int second = heap.poll();
            int mix = first + (second * 2);
            heap.add(mix);
            min = heap.peek();
        }

        if (K > min) {
            return -1;
        }

        return answer;
    }
}