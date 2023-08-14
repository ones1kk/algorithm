package io.github.ones1kk.programers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson17677 {

    public static int solution(String str1, String str2) {
        int answer = 65536;

        List<String> list1 = makePairStringList(str1.toUpperCase());
        List<String> list2 = makePairStringList(str2.toUpperCase());

        Map<String, Integer> map1 = new HashMap<>();
        for (String s : list1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (String s : list2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        if (map1.size() == 0 && map2.size() == 0) {
            return answer;
        }

        int union = 0;
        int inter = 0;

        for (String s : map1.keySet()) {
            if (map2.containsKey(s)) {
                inter += Math.min(map1.get(s), map2.get(s));
                union += Math.max(map1.get(s), map2.get(s));
                map2.remove(s);
                continue;
            }
            union += map1.get(s);
        }

        for (String s : map2.keySet()) {
            union += map2.get(s);
        }

        double result = (double) inter / union * answer;
        return (int) result;
    }

    private static List<String> makePairStringList(String str) {
        StringBuilder pair = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(i + 1))) {
                pair.append(str.charAt(i)).append(str.charAt(i + 1));
                list.add(pair.toString());
                pair = new StringBuilder();
            }

        }

        return list;
    }
}
