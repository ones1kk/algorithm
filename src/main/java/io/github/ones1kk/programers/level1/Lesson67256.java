package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson67256 {

    public static String solution(int[] numbers, String hand) {
        char[][] keypad = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
        // 초기화
        Map<Character, Position> decisionMap = new HashMap<>();
        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[i].length; j++) {
                char value = keypad[i][j];
                decisionMap.put(value, new Position(i, j));
            }
        }

        // 시작 위치
        Position leftHand = decisionMap.get('*');
        Position rightHand = decisionMap.get('#');

        // 조건
        List<Integer> leftArea = List.of(1, 4, 7);
        List<Integer> rightArea = List.of(3, 6, 9);
        List<Integer> decisionArea = List.of(2, 5, 8, 0);

        StringBuilder answer = new StringBuilder();
        for (int number : numbers) {
            Position target = decisionMap.get(Character.forDigit(number, 10));

            // 왼쪽 영역이면
            if (leftArea.contains(number)) {
                answer.append("L");
                leftHand = leftHand.move(target);
                continue;
            }

            // 오른쪽 영역이면
            if (rightArea.contains(number)) {
                answer.append("R");
                rightHand = rightHand.move(target);
                continue;
            }

            // 가운데 영역이면
            if (decisionArea.contains(number)) {
                int leftDistance = leftHand.distanceTo(target);
                int rightDistance = rightHand.distanceTo(target);

                // 왼쪽이 더 가까우면
                if (leftDistance < rightDistance) {
                    leftHand = leftHand.move(target);
                    answer.append("L");
                    // 오른쪽이 더 가까우면
                } else if (rightDistance < leftDistance) {
                    rightHand = rightHand.move(target);
                    answer.append("R");
                    // 거리가 같다면
                } else {
                    if (hand.equals("right")) {
                        rightHand = rightHand.move(target);
                        answer.append("R");
                    } else {
                        leftHand = leftHand.move(target);
                        answer.append("L");
                    }
                }
            }

        }

        return answer.toString();
    }

    static class Position {

        private final int row;

        private final int col;

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public int distanceTo(Position position) {
            return Math.abs(getRow() - position.getRow()) + Math.abs(getCol() - position.getCol());
        }

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public Position move(Position position) {
            return position;
        }
    }

}
