package io.github.ones1kk.day.bornze3.day7;

import java.util.Scanner;

public class Problem11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        while (true) {
            if (a.length() < 10) {
                System.out.println(a);
                break;
            } else {
                String substring = a.substring(0, 10);
                System.out.println(substring);
                a = a.substring(10);
            }
        }

    }
}
