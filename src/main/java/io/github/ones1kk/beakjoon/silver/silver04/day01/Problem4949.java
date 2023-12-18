package io.github.ones1kk.beakjoon.silver.silver04.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Stack;

public class Problem4949 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Character> map = Map.of(')', '(', ']', '[');
        while (true) {
            Stack<Character> stack = new Stack<>();
            String line = br.readLine();
            if (line.equals(".")) {
                break;
            }
            boolean flag = false;
            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                    continue;
                }

                if (c == ')' || c == ']') {
                    if (!stack.isEmpty()) {
                        Character peek = stack.peek();
                        if (peek == map.get(c)) {
                            stack.pop();
                        } else {
                            break;
                        }
                    }else {
                        flag = true;
                        break;
                    }
                }

            }

            if (stack.isEmpty() && !flag) {
                bw.append("yes").append("\n");
            } else {
                bw.append("no").append("\n");
            }
        }

        br.close();
        bw.close();
    }
}
