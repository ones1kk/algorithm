package io.github.ones1kk.study.book.do_it.week1.day07;

public class Class009 {

    // table = A C G T 의 갯수
    public static int resolve(char[] arr, int count, int[] table) {
        int answer = 0;

        int left = 0;
        int right = left + count;
        char[] target;
        int[] scores;

        while (right <= arr.length) {
            target = new char[count];
            scores = new int[4];

            int idx = 0;
            for (int i = left; i < right; i++) {
                target[idx] = arr[i];
                idx++;
            }


            int idx2 = 0;
            for (int i = left; i < right; i++) {
                char c = target[idx2];
                checkScore(c, scores);
                idx2++;
            }

            if (compare(table, scores)) {
                answer++;
            }

            left++;
            right++;
        }

        return answer;
    }

    private static void checkScore(char c, int[] scores) {
        switch (c) {
            case 'A':
                scores[0]++;
                break;
            case 'C':
                scores[1]++;
                break;
            case 'G':
                scores[2]++;
                break;
            case 'T':
                scores[3]++;
                break;
        }
    }

    private static boolean compare(int[] source, int[] target) {
        if (source[0] < target[0]) {
            return false;
        } else if (source[1] < target[1]) {
            return false;
        } else if (source[2] < target[2]) {
            return false;
        } else return source[3] <= target[3];
    }
}
