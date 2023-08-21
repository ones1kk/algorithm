// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/64065

import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("\\{", "");
        s = s.replaceAll("}", "");
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number.append(c);
            }

            if (c == ',' || i == s.length() - 1) {
                map.put(Integer.parseInt(number.toString()), map.getOrDefault(Integer.parseInt(number.toString()), 0) + 1);
                number = new StringBuilder();
            }
        }

        int[] answer = new int[map.size()];
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((v1, v2) -> (map.get(v2).compareTo(map.get(v1))));

        for (int i = 0; i < keys.size(); i++) {
            answer[i] = keys.get(i);
        }

        return answer;
    }
}