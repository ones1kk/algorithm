package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10815 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] sources = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            sources[j] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sources);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            int value = Integer.parseInt(st.nextToken());
            int result = binarySearch(sources, n, value);
            sb.append(result).append(" ");
        }

        System.out.println(sb);
        br.close();
    }

    public static int binarySearch(int[] sources, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (sources[mid] == search) {
                return 1;
            } else if (sources[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    }

}


