package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson1845 {

    public static int solution(int[] nums) {
        int n = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int j : nums) {
            set.add(j);
        }

        return Math.min(set.size(), n);
    }
}
