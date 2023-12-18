package io.github.ones1kk.beakjoon.silver.silver04.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1920 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (binarySearch(arr, Integer.parseInt(st.nextToken()))) {
                bw.append("1").append("\n");
            } else {
                bw.append("0").append("\n");
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }

    private static boolean binarySearch(int[] sources, int target) {
        int start = 0;
        int end = sources.length - 1;
        int mid;
        while (true) {
            mid = (start + end) / 2;
            if (sources[mid] == target) {
                return true;
            }
            if (sources[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (mid == start || mid == end) {
                return false;
            }
        }
    }
}
