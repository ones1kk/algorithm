package io.github.ones1kk.programers.level2;

import java.util.HashMap;
import java.util.Map;

public class Lesson131127 {

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 10 + 1; i++) {
            Map<String, Integer> target = new HashMap<>();
            for (int j = 0; j < 10; j++) {
                target.put(discount[i + j], target.getOrDefault(discount[i + j], 0) + 1);
            }

            boolean flag = true;
            for (String key : map.keySet()) {
                if (!map.get(key).equals(target.get(key))) {
                    flag = false;
                    break;
                }
            }

            answer += flag ? 1 : 0;

        }

        return answer;
    }
}
