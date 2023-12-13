package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Problem1308 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy M dd");
        LocalDate from = LocalDate.parse(br.readLine(), formatter);
        LocalDate to = LocalDate.parse(br.readLine(), formatter);

        int result = 0;

        while (!from.isEqual(to)) {
            from = from.plusDays(1);
            result++;

            if (from.isLeapYear() && from.getDayOfMonth() == 29 && from.getMonthValue() == 2) {
                from = from.plusDays(1);
            }
        }

        if (result >= 1000) {
            bw.append("gg");
        } else {
            bw.append("D-").append(String.valueOf(result));
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
