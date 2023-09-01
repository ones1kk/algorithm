package io.github.ones1kk.beakjoon.series16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem9012 {

    public static class Main {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int length = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < length; i++) {
                sb.append(solve(br.readLine())).append("\n");
            }

            bw.write(sb.toString());

            br.close();
            bw.close();
        }

        public static String solve(String line) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                stack.push(c);

                if (stack.size() > 1) {
                    if (stack.get(stack.size() - 1) == ')' && stack.get(stack.size() - 2) == '(') {
                        stack.pop();
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()) {
                return "YES";
            }

            return "NO";
        }
    }
}
