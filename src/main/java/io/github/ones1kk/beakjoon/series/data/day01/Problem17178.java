package io.github.ones1kk.beakjoon.series.data.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem17178 {

    public static void fail(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Ticket> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                StringTokenizer split = new StringTokenizer(st.nextToken(), "-");
                String alphabet = split.nextToken();
                int number = Integer.parseInt(split.nextToken());
                Ticket ticket = new Ticket(alphabet, number);

                while (true) {
                    if (stack.isEmpty()) {
                        stack.push(ticket);
                        break;
                    } else {
                        Ticket peek = stack.peek();
                        if (ticket.isFast(peek)) {
                            stack.push(ticket);
                            break;
                        } else {
                            stack.pop();
                        }
                    }

                }
            }
        }


        Queue<Ticket> q = new LinkedList<>();
        q.offer(stack.pop());
        while (!stack.isEmpty()) {
            Ticket ticket = stack.pop();
            if (!q.isEmpty()) {
                Ticket peek = q.peek();
                if (peek.isFast(ticket)) {
                    q.poll();
                    q.offer(ticket);
                }
            }
        }


        if (q.size() == 1) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD");
        }

        br.close();
    }

    static class Ticket {
        private final String alphabet;

        private final int number;

        Ticket(String alphabet, int number) {
            this.alphabet = alphabet;
            this.number = number;
        }

        public boolean isFast(Ticket ticket) {
            boolean a = this.alphabet.compareTo(ticket.alphabet) < 0;
            boolean b = this.number < ticket.number;
            if (this.alphabet.equals(ticket.alphabet)) {
                return b;
            }

            return a;
        }
    }
}
