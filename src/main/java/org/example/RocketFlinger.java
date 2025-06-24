package org.example;

public class RocketFlinger {
    String model;
    int power;

    RocketFlinger(String model, int power) {
        this.model = model;
        this.power = power;
    }
    RocketFlinger() {
        this("DefaultModel", 100);
//        this.model = "DefaultModel";
//        this.power = 100;
    }
// Calling Another Constructor with this()
     void displaySpecs() {
        System.out.println(model + " has power " + power);
    }
    public static void main(String[] args) {
        RocketFlinger rf = new RocketFlinger();
        RocketFlinger rf1 = new RocketFlinger("New Model", 1000);
        rf.displaySpecs();
        rf1.displaySpecs();
    }

}
