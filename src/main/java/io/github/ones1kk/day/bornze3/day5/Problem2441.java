package io.github.ones1kk.day.bornze3.day5;

import java.util.Scanner;

public class Problem2441 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            int space = a - i;
            String repeat = " ".repeat(space) + "*".repeat(i);
            System.out.print(repeat);
            System.out.println();
        }

    }
}
