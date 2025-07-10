package org.example;

public class InterfaceExample {
    public static void main(String[] args) {
        // Duck can fly and swim by implementing both interfaces.
        // No confusion, because interfaces don’t have method bodies, so Java knows what to do.
        Duck d1 = new Duck();
        d1.fly();
        d1.swim();
    }
}
// Interfaces are Java’s smart solution to allow multiple inheritance without confusion.

// An interface is like a contract that says: “Whoever uses me must implement these methods.”
// interfaces only has abstract methods
// we cannot create an object for interface

// //  Imagine a USB port. It defines what can be plugged in (keyboard, mouse, printer),
////  but not how they work internally.
//// Each device that uses USB must follow the same rules (interface) to connect.
// implements is used as keyword to extend interfaces

interface Flyable {
    void fly(); // abstract method
}

interface Swimmable {
    void swim(); // abstract method
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

   @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

}

// One class can implement 2 interfaces.
// This is how we can solve diamond problem


