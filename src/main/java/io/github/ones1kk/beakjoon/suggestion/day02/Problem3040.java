package io.github.ones1kk.beakjoon.suggestion.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3040 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Integer[] solve = solve(arr);
        for (Integer i : solve) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

    public static Integer[] solve(int[] arr) {
        int sum = 0;
        int length = arr.length;
        for (int k : arr) {
            sum += k;
        }

        int gap = sum - 100;

        Set<Integer> candidates = new HashSet<>();
        for (int i = 0; i < length; i++) {
            int start = arr[i];
            for (int j = i + 1; j < length; j++) {
                if (start + arr[j] == gap) {
                    candidates = Set.of(i, j);
                }
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (!candidates.contains(i)) {
                answer.add(arr[i]);
            }
        }

        return answer.toArray(Integer[]::new);
    }
}
