package io.github.ones1kk.beakjoon.silver.silver04.day06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem10825 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Student(name, korean, english, math));
        }

        list.sort((l1, l2) -> {
            if (l1.korean == l2.korean) {
                if (l1.english == l2.english) {
                    if (l1.math == l2.math) {
                        return l1.name.compareTo(l2.name);
                    }
                    return l2.math - l1.math;
                }
                return l1.english - l2.english;
            }
            return l2.korean - l1.korean;
        });

        for (Student student : list) {
            bw.append(student.name).append("\n");
        }


        br.close();
        bw.close();
    }


    public static class Student {
        private final String name;
        private final int korean;
        private final int english;
        private final int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}
