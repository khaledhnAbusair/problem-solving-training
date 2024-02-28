package com.abusair.training.amazonexample;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class knight {
    public static int knight(int x1, int y1, int x2, int y2, int n) {
        Queue<Index> arrayDeque = new ArrayDeque<>();
        Index start = new Index(x1, y1);
        Index end = new Index(x2, y2);
        arrayDeque.add(start);
        boolean[][] visited = new boolean[n + 1][n + 1];
        while (!arrayDeque.isEmpty()) {
            Index current = arrayDeque.poll();
            visited[current.x][current.y] = true;
            if (current.equals(end)) {
                return current.step;
            } else {
                for (int deltaX = -2; deltaX <= 2; deltaX++) {
                    for (int deltaY = -2; deltaY <= 2; deltaY++) {
                        if (deltaX == 0 || deltaY == 0 || Math.abs(deltaX) == Math.abs(deltaY)) {
                            continue;
                        } else {
                            Index next = new Index(current.x + deltaX, current.y + deltaY);
                            next.step = current.step + 1;
                            if (next.isInbound(n) && !visited[next.x][next.y]) {
                                arrayDeque.add(next);
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while (sc.hasNextLine()) {
            int size = Integer.parseInt(sc.nextLine());
            String startStr = sc.nextLine();
            String endStr = sc.nextLine();
            int x1 = Integer.parseInt(startStr.split(" ")[0]);
            int y1 = Integer.parseInt(startStr.split(" ")[1]);
            int x2 = Integer.parseInt(endStr.split(" ")[0]);
            int y2 = Integer.parseInt(endStr.split(" ")[1]);
            System.out.println(knight(x1, y1, x2, y2, size));
        }
    }

    static class Index {
        int x;
        int y;
        int step;

        public Index(int x, int y) {
            this.x = x;
            this.y = y;
            step = 0;
        }

        public boolean equals(Object o) {
            Index temp = (Index) o;
            return temp.x == this.x && temp.y == this.y;
        }

        public boolean isInbound(int n) {
            return this.x > 0 && this.x <= n && this.y > 0 && this.y <= n;
        }
    }
}