package io.github.ones1kk.day.bornze3.day5;

import java.util.Scanner;

public class Problem1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int candidate1 = Math.min(w - x, x);
        int candidate2 = Math.min(h - y, y);

        int result = Math.min(candidate1, candidate2);

        System.out.println(result);
    }
}
