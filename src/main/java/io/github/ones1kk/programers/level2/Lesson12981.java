package io.github.ones1kk.programers.level2;

import java.util.HashMap;
import java.util.Map;

public class Lesson12981 {

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, 0);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = map.get(word);
            if (i > 0 && (count > 0 ||
                    !words[i - 1].substring(words[i - 1].length() - 1).equals(word.substring(0, 1)))) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            map.put(word, count += 1);
        }

        return answer;
    }
}
