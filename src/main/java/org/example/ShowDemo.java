package org.example;

public class ShowDemo {
    public static void main(String[] args) {
        Point obj = new Point(3, 4, 5);
        obj.show();
    }
}

class Node {
    int x;
    int y;

    Node(int a, int b) {
        this.x = a;
        this.y = b;
    }

    void show() {
        System.out.println("x and y: " + this.x + " " + this.y);
    }
}

class Point extends Node {
    int z;

    Point(int a, int b, int c) {
        super(a, b);
        z = c;
    }

    @Override
    void show() {
        super.show();
        System.out.println("z: " + z);
    }
}
