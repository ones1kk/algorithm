package io.github.ones1kk.programers.level2;

import java.util.LinkedList;
import java.util.List;

public class Lesson17680 {

    public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        int answer = 0;

        List<String> cache = new LinkedList<>();
        for (String city : cities) {
            String s = city.toUpperCase();
            if (cache.remove(s)) {
                answer++;
                cache.add(s);
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                cache.add(s);
            }
        }
        return answer;
    }

}
