package io.github.ones1kk.programers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson64065 {

    public static int[] solution(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            int val = Integer.parseInt(matcher.group());
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int size = map.size();
        int[] answer = new int[size];

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((v1, v2) -> (map.get(v2).compareTo(map.get(v1))));

        for (int i = 0; i < keys.size(); i++) {
            answer[i] = keys.get(i);
        }

        return answer;
    }
}
