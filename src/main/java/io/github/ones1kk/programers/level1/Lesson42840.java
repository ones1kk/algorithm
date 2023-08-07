package io.github.ones1kk.programers.level1;

import java.util.ArrayList;
import java.util.List;

public class Lesson42840 {

    public static int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 2, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] candidates = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) candidates[0]++;
            if (answers[i] == student2[i % student2.length]) candidates[1]++;
            if (answers[i] == student3[i % student3.length]) candidates[2]++;
        }

        int max = Math.max(candidates[0], Math.max(candidates[1], candidates[2]));
        List<Integer> list = new ArrayList<>();
        for (int candidate : candidates) {
            if (max == candidate) {
                list.add(candidate);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = i + 1;
        }

        return answer;
    }
}
