package io.github.ones1kk.programers.level2;

import java.util.PriorityQueue;

public class Lesson42626 {

    // 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : scoville) {
            heap.add(i);
        }

        int min = heap.peek();
        while (min < K && heap.size() > 1) {
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
