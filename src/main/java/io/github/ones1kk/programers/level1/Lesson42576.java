package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.Map;

public class Lesson42576 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> table = new HashMap<>();
        for (String runner : participant) {
            table.put(runner, table.getOrDefault(runner, 0) + 1);
        }
        for (String runner : completion) {
            table.put(runner, table.get(runner) - 1);
        }

        for (String key : table.keySet()) {
            if (table.get(key).equals(1)) {
                answer = key;
                break;
            }
        }

        return answer;
    }

}
