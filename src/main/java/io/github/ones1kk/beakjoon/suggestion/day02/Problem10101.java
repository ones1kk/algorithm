package io.github.ones1kk.beakjoon.suggestion.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Problem10101 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        boolean isEquilateral = false;
        for (int i = 0; i < 3; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value;
            set.add(value);
            isEquilateral = value == 60;
        }

        if (sum != 180) {
            System.out.println("Error");
            return;
        } else {
            if (isEquilateral) {
                System.out.println("Equilateral");
                return;
            }

            if (set.size() == 2) {
                System.out.println("Isosceles");
                return;
            }
            if (set.size() == 3) {
                System.out.println("Scalene");
                return;
            }
        }

        br.close();
    }
}
