package org.example;

public class FinalExample {
    // The final keyword in Java is used to restrict changes in different ways.
    // It can be used with variables, methods, and classes for different purposes.
    public static void main(String[] args) {
        BankFamous b1 = new BankFamous();
        System.out.println(b1.INTEREST_RATE);
        //b1.INTEREST_RATE = 6.0;
        SportsCar sc = new SportsCar();
        sc.speedLimit();
    }
}


class BankFamous {
    final double INTEREST_RATE = 5.0; // Cannot be changed
    //INTEREST_RATE = 10.0;
    // final variables must be initialized when declared.
    // Once assigned, the value CANNOT be changed.
    //  final to Create Constants
}

// When you add final to a method ->  Prevent Method Overriding
class CarFamous {

    final void speedLimit() {
        System.out.println("Speed limit is 100 km/h.");
    }
}
// Prevents a subclass from changing (overriding) a method.

class SportsCar extends CarFamous {
//    @Override
//    void speedLimit() {
//         System.out.println("Speed limit is 200 km/h.");
//     }

}
// Marking a method final ensures its logic cannot be modified in subclasses.
// Useful for important business rules that should remain unchanged.

// when we add final infront of class -> Prevent Inheritance

// Once an ID is generated, it should NEVER be changed.
final class GovernmentID {
    void displayID() {
        System.out.println("Government ID cannot be modified.");
    }
}

//class FakeId extends GovernmentID {
//
//
//}
// Marking a class final ensures nobody can extend (modify) it
// Useful for security-sensitive classes like IDs, payments, etc.
