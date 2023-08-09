package io.github.ones1kk.programers.level2;

import java.util.Arrays;

public class Lesson12941 {

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            int b = B[A.length - 1 - i];

            answer += a * b;
        }

        return answer;
    }
}
