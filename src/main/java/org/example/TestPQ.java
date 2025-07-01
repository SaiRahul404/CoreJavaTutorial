package org.example;

public class TestPQ {
    public static void main(String[] args) {
        Q obj = new Q(5, 10);
        obj.show();
    }
}

class P {
    int x;
}

class Q extends P {
    int x; // Hides x in P

    Q(int a, int b) {
        super.x = a; // Access parent class field
        this.x = b;  // Access current class field
    }

    void show() {
        System.out.println("P ---> x = " + super.x);
        System.out.println("Q ---> x = " + this.x);
    }
}