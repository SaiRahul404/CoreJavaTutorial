package org.example;

public class Smartphone extends ElectronicDevice {

    void call() {
        System.out.println("Calling from the smartphone...");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.powerOn();
        l1.code();
        l1.powerOff();
    }

}
