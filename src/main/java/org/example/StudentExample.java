package org.example;

public class StudentExample {
    public static void main(String[] args) {
        StudentSchool st1 = new StudentSchool("Venkat", 2);
//        st1.name = "Venkat";
//        st1.rollNo = 1;
        StudentSchool st2 = new StudentSchool();
//        st2.rollNo = 2;
//        st2.name = "Rahul";
        StudentSchool st3 = new StudentSchool("Vaibhav", 100);
//        st3.name = "XYZ";
//        st3.rollNo = 3;
//        System.out.println(st1.name);
//        System.out.println(st2.name);
//        System.out.println(st1.rollNo);
//        System.out.println(st2.rollNo);
        st1.printStudentDetails();
        st2.printStudentDetails();
       st3.printStudentDetails();
    }

}


class StudentSchool {
    int rollNo;

    String name;

    void printStudentDetails() {
        System.out.println("Roll no: " + rollNo);
        System.out.println("Name: " + name);
    }
    // Constructor - unique function

    StudentSchool() {
        rollNo = 1;
        name = "Rahul";
    }

    StudentSchool(String studentName, int number) {
        rollNo = number;
        name = studentName;
    }
//    StudentSchool() {
//
//    }
    // A constructor in Java is a special method that is used to initialize objects. It is called automatically when an object of a class is created.
    // A constructor has the same name as the class.
    // It does not have a return type, not even void.

    // class Car {
    //    String model;
    //
    //    // Constructor
    //    Car(String m) {
    //        model = m;
    //    }
    // Car myCar = new Car("Toyota");
    //}

    //
    // Default Constructor
    // class Dog {
    //    String breed;
    //
    //    Dog() {
    //        breed = "Labrador";
    //    }

    //}

    // Parameterized Constructor
    // class Dog {
    //    String breed;
    //
    //    Dog(String b) {
    //        breed = b;
    //    }
    //}
    // If you define any constructor, Java does not provide a default one.
}


