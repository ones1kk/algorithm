package io.github.ones1kk.day.bornze3.day1;

import java.util.Scanner;

public class Problem2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        char[] charArray = String.valueOf(sc.nextInt()).toCharArray();

        int sum = 0;
        int pow = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            int value = Integer.parseInt(String.valueOf(charArray[i])) * a;
            sum += (int) (value * Math.pow(10, pow));
            System.out.println(value);
            pow++;
        }

        System.out.println(sum);
    }
}
