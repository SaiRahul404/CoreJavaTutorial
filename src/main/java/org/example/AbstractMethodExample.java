package org.example;

public class AbstractMethodExample {

    // Abstract Method = A method that has been declared but not defined
    // (We just say "it exists," but we don’t explain how it works yet).

    // abstract void move();
    // // Abstract method (only declared, not defined)

    // // Abstract method (declared, but no body)
    //    abstract void move();
    //
    //    // Regular method (with a body)
    //    void stop() {
    //        System.out.println("Vehicle has stopped.");
    //    }
    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle();
        Vehicle myCar = new CarL(); // this is object for CarL class
        myCar.move();
        myCar = new Boat();
        myCar.move();
        myCar.stop();

    }
}

abstract class Vehicle {
    // Abstract method (declared, but no body)
    abstract void move();


    // Regular method (with a body)
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

class CarL extends Vehicle {
    @Override
    void move() {
        System.out.println("Car moves by driving on roads.");
    }

}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("Boat moves by floating on water.");
    }
}



// If any class is having at least one abstract method the such class is called Abstract class
// You cannot create an object of an abstract class.
// Reason : Because Vehicle is incomplete (it has a missing move() method).
//  Subclasses which extends the abstract class should override the abstract methods(complusory)
// Abstract classes provide a common base but are incomplete without subclasses.
// You cannot create objects of abstract classes directly.
