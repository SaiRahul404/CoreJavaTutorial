package org.example;

public class Employee {
    String name;
    int id;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

}

class Manager extends Employee {
    void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}

