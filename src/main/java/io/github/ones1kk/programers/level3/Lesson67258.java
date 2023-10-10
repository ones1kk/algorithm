package io.github.ones1kk.programers.level3;

import java.util.*;

public class Lesson67258 {
    public static int[] solution(String[] gems) {
        Set<String> target = new HashSet<>(List.of(gems));
        Queue<String> q = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        int start = 0;
        int end = Integer.MAX_VALUE;
        int startPoint = 0;

        for (String gem : gems) {
            map.put(gem, map.getOrDefault(gem, 0) + 1);
            q.offer(gem);

            while (true) {
                String targetGem = q.peek();

                if (map.get(targetGem) <= 1) {
                    break;
                }

                q.poll();
                start++;
                map.put(targetGem, map.get(targetGem) - 1);
            }

            if (map.size() == target.size() && end > q.size()) {
                startPoint = start;
                end = q.size();
            }
        }

        return new int[] {startPoint + 1, startPoint + end};
    }
}
