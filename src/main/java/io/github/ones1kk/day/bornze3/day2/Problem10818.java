package io.github.ones1kk.day.bornze3.day2;

import java.util.Scanner;

public class Problem10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < length; i++) {
            int value = sc.nextInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }

        System.out.println(min + " " + max);
    }
}
