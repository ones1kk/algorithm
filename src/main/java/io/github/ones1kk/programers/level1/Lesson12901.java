package io.github.ones1kk.programers.level1;

import java.time.*;
import java.time.format.TextStyle;
import java.util.*;

public class Lesson12901 {

    public static String solution(int a, int b) {
        int year = 2016;
        LocalDate date = LocalDate.of(year, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }

}
