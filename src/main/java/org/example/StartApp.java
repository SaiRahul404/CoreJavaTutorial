package org.example;

public class StartApp {
    public static void main(String[] args) {
        Grip g1 = new Grip(2, 4);
        g1.print();
    }
}

class Core { // Parent class
    int val;

    void print() {
        System.out.println(this.val);
    }
}

class Grip extends Core {
    int val;

    Grip(int coreVal, int gripVal) {
        super.val = coreVal;   // set value in Core
        this.val = gripVal;    // set value in Grip
    }

    void print() {
        System.out.println("Core val: " + super.val);
        System.out.println("Grip val: " + this.val);
    }

}
