package io.github.ones1kk.programers.level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Lesson76502 {

    public static int solution(String s) {
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
                    if (!stack.contains(map.get(c))) {
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
