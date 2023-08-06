package io.github.ones1kk.programers.level1;

public class Lesson17681 {

    // 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
    // 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
    // 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
    // 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace('0', ' ');
            answer[i] = answer[i].replace('1', '#');

            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
        
        return answer;
    }
}
