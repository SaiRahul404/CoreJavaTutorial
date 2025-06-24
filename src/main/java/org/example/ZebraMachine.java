package org.example;

public class ZebraMachine {
    int speed;

    ZebraMachine(int speed) {
        this.speed = speed;
    }

    ZebraMachine() {
        this.speed = 0;
    }

     void displaySpeed() {
        System.out.println("Speed is: " + this.speed);
    }

    public static void main(String[] args) {
        ZebraMachine zm = new ZebraMachine(75);
        zm.displaySpeed();
        ZebraMachine zm2 = new ZebraMachine();
        zm2.displaySpeed();
        ZebraMachine zm3 = new ZebraMachine(10000);
    }
}

