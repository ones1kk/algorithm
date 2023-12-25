package io.github.ones1kk.beakjoon.silver.silver04.day08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1059 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        int[] arr = new int[l];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] == n) {
                break;
            }

            if (arr[i] > n) {
                if (i > 0) {
                    int value = arr[i - 1];
                    int gap = arr[i] - arr[i - 1] - 1;
                    int[] candidates = new int[gap];
                    for (int j = 0; j < gap; j++) {
                        candidates[j] = ++value;
                    }

                    int start = candidates[0];
                    int end = candidates[candidates.length - 1];
                    while (start <= n) {
                        int second = start + 1;
                        while (second <= end) {
                            if (start <= n && n <= second) {
                                answer++;
                            }
                            second++;
                        }
                        start++;
                    }
                }else {
                    int start = 1;
                    int end = arr[i]-1;
                    for (int j = start; j < end; j++) {
                        while (start <= n) {
                            int second = start + 1;
                            while (second <= end) {
                                if (start <= n && n <= second) {
                                    answer++;
                                }
                                second++;
                            }
                            start++;
                        }
                    }
                }
                break;
            }
        }

        bw.append(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
