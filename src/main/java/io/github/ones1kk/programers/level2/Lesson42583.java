package io.github.ones1kk.programers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Lesson42583 {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int idx = 0;
        Queue<Truck> queue = new LinkedList<>();
        while (true) {
            if (!queue.isEmpty()) {
                Truck truck = queue.peek();
                if (truck.canMove(bridge_length)) {
                    queue.poll();
                }
            }

            if (idx <= truck_weights.length - 1) {
                if (queue.stream().mapToInt(Truck::getWeight).sum() + truck_weights[idx] <= weight && queue.size() <= bridge_length) {
                    queue.offer(new Truck(truck_weights[idx]));
                    idx++;
                }
            }

            for (Truck truck : queue) {
                truck.addTime();
            }

            if(idx == truck_weights.length && queue.isEmpty()) {
                break;
            }

            answer++;
        }

        return answer;
    }

    static class Truck {

        private final int weight;

        private int time;


        Truck(int weight) {
            this.weight = weight;
            this.time = 0;
        }

        public void addTime() {
            this.time++;
        }

        public boolean canMove(int standard) {
            return this.time == standard;
        }

        public int getWeight() {
            return weight;
        }
    }
}
