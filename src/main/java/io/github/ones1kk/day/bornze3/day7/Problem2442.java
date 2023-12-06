package io.github.ones1kk.day.bornze3.day7;

import java.util.Scanner;

public class Problem2442 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int space = a;
        for (int i = 1; i <= a; i++) {
            space -= 1;
            int startCount = 2 * i - 1;
            System.out.println(" ".repeat(Math.max(space, 0)) + "*".repeat(startCount));
        }
    }

}
