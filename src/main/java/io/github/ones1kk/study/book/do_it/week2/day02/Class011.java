package io.github.ones1kk.study.book.do_it.week2.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Class011 {

    public static String[] resolve(int[] arr) {
        List<String> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int num = 1;
        for (int su : arr) {
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    answer.add("+");
                }
                stack.pop();
                answer.add("-");
            } else {
                int n = stack.pop();
                if (n > su) {
                    return new String[]{"NO"};
                } else {
                    answer.add("-");
                }
            }
        }

        return answer.toArray(String[]::new);
    }
}
