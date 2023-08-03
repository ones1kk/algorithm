package io.github.ones1kk.programers.level1;

import java.util.ArrayList;
import java.util.List;

public class Lesson77484 {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] result = new int[]{6, 6, 5, 4, 3, 2, 1};

        List<Integer> winList = new ArrayList<>();
        for (int num : win_nums) {
            winList.add(num);
        }

        int count = 0;
        int removedNumCount = 0;
        for (int lotto : lottos) {
            if (winList.contains(lotto)) {
                count++;
            }

            if (lotto == 0) {
                removedNumCount++;
            }
        }

        return new int[]{result[count + removedNumCount], result[count]};
    }
}
