package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.Map;

public class Lesson142086 {

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.getOrDefault(c , -1) == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(c);
            }
            map.put(c, i);
        }

        return answer;
    }
}
