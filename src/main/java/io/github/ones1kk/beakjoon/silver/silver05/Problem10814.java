package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem10814 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            people.add(new Person(i, name, age));
        }

        people.sort((p1, p2) -> {
            if (p1.age == p2.age) {
                return Integer.compare(p1.idx, p2.idx);
            }
            return Integer.compare(p1.age, p2.age);
        });

        for (Person person : people) {
            bw.append(String.valueOf(person.age))
                    .append(" ")
                    .append(person.name)
                    .append("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }

    public static class Person {

        private final int idx;
        private final String name;
        private final int age;

        public Person(int idx, String name, int age) {
            this.idx = idx;
            this.name = name;
            this.age = age;
        }
    }
}
