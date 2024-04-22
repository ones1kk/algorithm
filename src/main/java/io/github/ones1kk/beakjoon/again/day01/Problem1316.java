package io.github.ones1kk.beakjoon.again.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Problem1316 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        String[] words = new String[n];
        int index = 0;
        while (n-- > 0) {
            words[index] = br.readLine();
            index++;
        }

        int answer = solve(words);

        System.out.println(answer);

        br.close();
    }

    public static int solve(String[] words) {
        int answer = 0;
        for (String word : words) {
            Set<Character> set = new HashSet<>();
            boolean flag = true;
            Character previous = null;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(i > 0) {
                    previous = word.charAt(i-1);
                }
                if (set.contains(c)) {
                    if (set.size() > 1 && previous != c) {
                        flag = false;
                        break;
                    }
                } else {
                    set.add(c);
                }
            }

            if (flag) {
                answer++;
            }

        }

        return answer;
    }
}
