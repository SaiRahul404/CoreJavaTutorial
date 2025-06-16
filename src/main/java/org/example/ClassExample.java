package org.example;

public class ClassExample {
    public static void main(String[] args) {
        Car firstCar = new Car(); // Creating an Object
        Car secondCar = new Car();
        firstCar.speed = 100;
        firstCar.color = "Red";
        secondCar.speed = 50;
        secondCar.color = "White";
        firstCar.drive();
        secondCar.drive();
        secondCar.accelerate();
        Person p1 = new Person(); // create an object
        p1.sayHello();
        p1.introduce();
        Person p2 = new Person();
        p2.sayHello();

    }
}

class Car {
     // Instance Variables (features of a car)
    String color;
    int speed;

    void drive() {
        System.out.println("The car is driving.");
    }

    void accelerate() {
        System.out.println("The car is accelarating.");
    }
}

class Person {
    // Method (an action the person can do)
    void sayHello() {
        System.out.println("Hello!");
    }

    void introduce() {
        System.out.println("My name is John.");
    }
}

// {
// color : "Red"
// speed : 100
//}

// {
// color : "White"
// speed : 50
//}

// A class is like a blueprint or template.
// An object is a real thing created from the class (blueprint).

// Car is a class.
//
//color and speed are properties.
//
//drive() is a method – an action the car can perform.
