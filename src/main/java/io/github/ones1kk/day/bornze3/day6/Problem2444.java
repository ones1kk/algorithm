package io.github.ones1kk.day.bornze3.day6;

import java.util.Scanner;

public class Problem2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int length = 2 * a - 1;

        for (int i = 1; i <= length; i++) {
            if (i % 2 != 0) {
                int space = (length - i) / 2;
                String start = " ".repeat(Math.max(0, space)) +
                        "*".repeat(Math.max(0, i));
                System.out.print(start);
                System.out.println();
            }
        }

        for (int i = length - 1; i > 0; i--) {
            if (i % 2 != 0) {
                int space = (length - i) / 2;
                String start = " ".repeat(Math.max(0, space)) +
                        "*".repeat(i);
                System.out.print(start);
                System.out.println();
            }
        }

    }
}
