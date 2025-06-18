package org.example;

public class CarFactory {
    String carColor;
    int maxSpeed;

    void printCarDetails() {
        System.out.println("The color of car is " + carColor + " max Speed is " + maxSpeed);
    }

//    CarFactory() {
//
//    }
}

class CarFactoryMain {
    public static void main(String[] args) {
        CarFactory carFactory1 = new CarFactory();
        carFactory1.carColor = "Blue";
        carFactory1.maxSpeed = 50;
        carFactory1.printCarDetails();
        CarFactory carFactory2 = new CarFactory();
        carFactory2.carColor = "Red";
        carFactory2.maxSpeed = 100;
        carFactory2.printCarDetails();
    }
}
