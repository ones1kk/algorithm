package io.github.ones1kk.day.bornze3.day3;

import java.util.Scanner;

public class Problem2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        int max = 0;

        for (int i = 1; i < 10; i++) {
            int value = sc.nextInt();
            if (value > max) {
                max = value;
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);

    }
}
