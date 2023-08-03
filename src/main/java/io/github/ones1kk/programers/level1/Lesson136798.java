package io.github.ones1kk.programers.level1;

import java.util.HashSet;
import java.util.Set;

public class Lesson136798 {

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        int[] counts = new int[number];

        for (int a = 1; a <= number; a++) {
            double sqrt = Math.sqrt(a);
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= sqrt; i++) {
                if (a % i == 0) {
                    if (Math.pow(i, 2) == a) {
                        set.add(i);
                    } else {
                        set.add(i);
                        set.add(a / i);
                    }
                }
            }
            counts[a - 1] = set.size();
            if (counts[a - 1] > limit) {
                answer += power;
            } else {
                answer += counts[a - 1];
            }
        }

        return answer;
    }
}
