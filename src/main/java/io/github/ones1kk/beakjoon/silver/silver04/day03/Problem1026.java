package io.github.ones1kk.beakjoon.silver.silver04.day03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Problem1026 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        List<Integer> list = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Arrays.sort(arr1);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            Integer max = Collections.max(list);
            sum += arr1[i] * max;
            list.remove(max);
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
