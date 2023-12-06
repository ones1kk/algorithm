package io.github.ones1kk.day.bornze3.day6;

import java.util.Scanner;

public class Problem4153 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            double pow1 = Math.pow(a, 2);
            double pow2 = Math.pow(b, 2);
            double pow3 = Math.pow(c, 2);

            boolean result = false;
            if (b < a && c < a) {
                if (pow1 == pow2 + pow3) {
                    result = true;
                }
            } else if (a < b && c < b) {
                if (pow2 == pow1 + pow3) {
                    result = true;
                }
            } else if (a < c && b < c) {
                if (pow3 == pow1 + pow2) {
                    result = true;
                }
            }

            if (result) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}
