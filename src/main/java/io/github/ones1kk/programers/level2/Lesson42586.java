package io.github.ones1kk.programers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lesson42586 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int complete = 100;

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            double rest = (double) (complete - progress) / speed;

            int day = (int) Math.ceil(rest);
            if (!queue.isEmpty() && queue.peek() < day) {
                list.add(queue.size());
                queue.clear();
            }

            queue.offer(day);
        }

        list.add(queue.size());

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
