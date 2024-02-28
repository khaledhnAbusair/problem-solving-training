package com.abusair.training.amazonexample.chessproblem;

class Node {
    // (x, y) represents chess board coordinates
    // dist represent its minimum distance from the source
    int x, y, dist;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
