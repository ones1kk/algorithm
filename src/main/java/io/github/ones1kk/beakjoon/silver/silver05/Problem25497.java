package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem25497 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                answer++;
            } else if (c == 'L') {
                s1.push(c);
            } else if (c == 'S') {
                s2.push(c);
            } else if (c == 'K') {
                if (!s2.isEmpty()) {
                    answer++;
                    s2.pop();
                } else {
                    break;
                }
            } else if (c == 'R') {
                if (!s1.isEmpty()) {
                    answer++;
                    s1.pop();
                } else {
                    break;
                }
            }
        }
        System.out.println(answer);

        br.close();
    }

}
