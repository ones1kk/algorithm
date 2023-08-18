package io.github.ones1kk.programers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson42578 {

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, List<String>> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String name = clothe[0];
            String category = clothe[1];

            List<String> defaultList = map.getOrDefault(category, new ArrayList<>());
            defaultList.add(name);
            map.put(category, defaultList);
        }

        for (String category : map.keySet()) {
            answer *= map.get(category).size() + 1;
        }

        return answer - 1;
    }
}
