package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lesson160586 {

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, List<Integer>> graph = new HashMap<>();

        for (String value : targets) {
            for (char targetChar : value.toCharArray()) {
                List<Integer> indexes = new LinkedList<>();
                for (String s : keymap) {
                    indexes.add(s.indexOf(targetChar));
                }
                graph.put(targetChar, indexes);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            char[] charArray = targets[i].toCharArray();
            for (char c : charArray) {
                List<Integer> counts = graph.get(c);
                int min = counts.get(0);
                for (Integer count : counts) {
                    if ((min == -1) || (min > count && count > -1)) {
                        min = count;
                    }
                }

                if (min != -1) {
                    answer[i] += min + 1;
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }

}
