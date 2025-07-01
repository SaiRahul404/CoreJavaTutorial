package org.example;

public class ContainerTest {
    // The first calls the superclass  constructor
    public static void main(String[] args) {
        SmallContainer s1 = new SmallContainer(10);
    }

}

class Container {
    // Default constructor
    Container() {
        System.out.println("Inside default constructor of Container");
    }

    Container(int size) {
        System.out.println("Inside parameterized constructor of Container with size " + size);
    }
}

class SmallContainer extends Container {
    // Parameterized constructor
    SmallContainer(int size) {
        super(size); // Call the constructor of the parent class
        System.out.println("Inside parameterized constructor of SmallContainer with size: " + size);
    }
}
