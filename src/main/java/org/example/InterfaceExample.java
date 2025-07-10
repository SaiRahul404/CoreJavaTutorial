package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

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











//
//    Think of syntax errors as forgetting to follow traffic rules.
//
//   If you forget to put a semicolon (;) at the end of a Java statement,
//   it's like running a red light—the compiler will immediately stop you and
//   not let you continue until you fix it.
//// Incorrect: Missing semicolon
//        System.out.println("Hello World")

//    Exceptions are unexpected problems that occur when a program is running, like hitting a pothole while driving. If not handled properly, they can cause the entire program to crash.
//        Example: Division by Zero (Math Mistake)
//        If you divide a number by zero in Java, you get an ArithmeticException:
//        int a = 10;
//        int b = 0;
//        int result = a / b; // ERROR: Division by zero!
//
//    Checked Exceptions
//Definition: Exceptions that are checked at compile-time.
//
//    Unchecked Exceptions
//Definition: Exceptions that are not checked at compile-time, but at runtime.
////try-catch block
//Java provides try-catch blocks to handle exceptions,
//        just like seatbelts protect you in case of an accident.
//try {
//        int a = 10;
//        int b = 0;
//        int result = a / b;
//        } catch (ArithmeticException e) {
//        System.out.println("Error: Cannot divide by zero.");
//        }catch(Exception ){
//}
//        catch(Divisionbyzero ){
//        }
//Exception---arithmetic/null/division/arrayindex/.....
//finally ---irrespective of exception this block will execute
// {
//        System.out.println("Cleaning up...");
//        }
//throw---manual exception and throws---automatic keyword...

//    void checkAge(int age) {
//        if (age < 18) {
//            throw new IllegalArgumentException("Not eligible to vote");
//        }
//    }

//    void readFile() throws FileNotFoundException {
//        FileReader file = new FileReader("data.txt"); // Might not exist
//    }

//    void level1() {
//        level2();
//    }
//    void level2() {
//        level3();
//    }
//    void level3() {
//        int result = 10 / 0; // Causes an exception
//    }

//✔ Use try-catch to handle errors without crashing the program.
//        ✔ Finally block always runs to clean up resources.
//        ✔ Throw & throws help signal and manage errors.


//### **Types of Errors**
//        1. **Syntax Errors**
//        - Like spelling mistakes in code. Java won’t even run the program.
//        - *Example:* Forgetting a semicolon `;` or misspelling `System.out.println`.
//
//        2. **Logical Errors**
//        - Your code runs but gives wrong results.
//        - *Example:* Calculating `5 + 3` as `15` because you accidentally used `*`.
//
//        3. **Runtime Errors (Exceptions)**
//        - Code looks correct but fails during execution.
//        - *Example:* Dividing by zero (`10 / 0`).














