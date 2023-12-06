package io.github.ones1kk.day.bornze3.day4;

import java.util.Scanner;

public class Problem10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int y = n % h;
            int x = n / h;

            if (y == 0) {
                if (x < 10) {
                    System.out.println(h + "0" + x);
                } else {
                    System.out.println(h + "" + x);
                }
            } else {
                x++;
                if (x < 10) {
                    System.out.println(y + "0" + x);
                } else {
                    System.out.println(y + "" + x);
                }
            }

        }

    }
}
