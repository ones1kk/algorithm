package io.github.ones1kk.study.book.do_it.week2.day05;

public class Class015 {

    public static String resolve(String str) {
        StringBuilder answer = new StringBuilder();

        int length = str.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }


        for (int i = 0; i < length; i++) {

            int max = i;
            for (int j = i; j < length; j++) {
                int current = arr[j];
                int maxValue = arr[max];
                if (current > maxValue) {
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            answer.append(arr[i]);
        }

        return answer.toString();
    }
}
