package io.github.ones1kk.study.book.do_it.week2.day06;

import java.util.ArrayList;
import java.util.List;

public class Class016 {

    public static Integer resolve(int[] arr) {
        int length = arr.length;
        int[] sum = new int[length];

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            people.add(new Person(i + 1, arr[i]));
        }

        people.sort((a1, a2) -> {
            if (a1.value == a2.value) {
                return a1.order - a2.order;
            }
            return a1.value - a2.value;
        });

        sum[0] = people.get(0).value;

        for (int i = 1; i < people.size(); i++) {
            sum[i] = sum[i - 1] + people.get(i).value;
        }

        int answer = 0;
        for (int i : sum) {
            answer += i;
        }

        return answer;
    }

    static class Person {
        int order;
        int value;

        public Person(int order, int value) {
            this.order = order;
            this.value = value;
        }
    }
}
