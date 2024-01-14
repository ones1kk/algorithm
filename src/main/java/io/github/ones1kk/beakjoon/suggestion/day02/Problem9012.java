package io.github.ones1kk.beakjoon.suggestion.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem9012 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            sb.append(solve(line)).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

    public static String solve(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    char peek = stack.peek();
                    if (peek == '(') {
                        stack.pop();
                    } else {
                        return "NO";
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }


        return "YES";
    }
}
