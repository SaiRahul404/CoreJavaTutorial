package org.example;

public class PrintMethods {
    public static void main(String[] args) {
        sayHello("Rahul");
        sayHello("Venkat");
        sayHello("Ajay");
        int c = add(4, 5);
        System.out.println(c);
        System.out.println(add(6, 7));
        System.out.println(multiply(3, 5));
        greetUser("Ajay");
        multiplyWithoutReturn(7,6);

    } // main method or main function

    // no return type - void
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayHelloToRahul() {
        System.out.println("Hello Rahul");
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void multiplyWithoutReturn(int a, int b) {
        System.out.println("Answer : " + (a * b));
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Nice to meet you.");
    }

}

// System.out.print("Hello ");
//        System.out.print("World");
//
//        System.out.println("Hello ");
//        System.out.println("World");
//
//        // print()
//        // It prints the text but does NOT move to the next line.
//        //If you print multiple things, they appear on the same line.
//        System.out.print("Hello\nWorld"); // You can also force a new line using \n.
//
//        // println()
//        // It prints the text and automatically moves to the next line.
//
//        // println() → Prints and moves to the next line.
//        // print() → Prints but stays on the same line.
// // User-defined functions
//    //  You wrote the code once, and used it multiple times!

// | **Type**               | **What It Does**                    | **Example**         |
//| ---------------------- | ----------------------------------- | ------------------- |
//| Method with no return  | Just does something (like printing) | `sayHello()`        |
//| Method with return     | Gives back a result (like a sum)    | `add(2, 3)`         |
//| Method with parameters | Accepts inputs like name or numbers | `greetUser("John")` |