package io.github.ones1kk.day.bornze3.day2;

import java.util.Scanner;

public class Problem2884 {

    public static void main(String[] args) {
        int standard = 45;

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute < standard) {
            minute += 60;
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
        }

        minute -= 45;

        System.out.println(hour + " " + minute);
    }
}
