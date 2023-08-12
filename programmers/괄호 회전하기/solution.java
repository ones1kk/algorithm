// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/76502

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int j = 0; j < substring.length(); j++) {
                char c = substring.charAt(j);
                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                } else if (c == ']' || c == ')' || c == '}') {
                    if (!stack.contains(map.get(c)) ) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (flag && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}