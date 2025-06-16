package org.example;

public class SimpleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Defined in Dog
    }
}

class Animal {  // Superclass
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {  // Subclass
    void bark() {
        System.out.println("Dog is barking");
    }
}
