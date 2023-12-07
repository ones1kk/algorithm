package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem1427 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numbers = br.readLine();

        char[] charArray = numbers.toCharArray();
        Character[] arr = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            arr[i] = charArray[i];
        }


        Arrays.sort(arr, (a1, a2) -> {
            int first = Character.getNumericValue(a1);
            int second = Character.getNumericValue(a2);
            return Integer.compare(second, first);
        });

        for (Character c : arr) {
            bw.append(c);
        }

        bw.flush();

        br.close();
        bw.close();
    }

    public void test() {

    }
}
