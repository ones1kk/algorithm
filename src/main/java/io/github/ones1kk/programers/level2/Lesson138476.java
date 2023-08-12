package io.github.ones1kk.programers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson138476 {

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : tangerine) {
            Integer count = map.getOrDefault(j, 0);
            map.put(j, count + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));

        for (Integer size : list) {
            k -= map.get(size);
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}
