package org.example;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        AddNumberClass addNumberClass = new AddNumberClass();
        addNumberClass.add(4, 8, 9);

    }
}

class AddNumberClass {

    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }

    void bookTicket(String name) {
        System.out.println(name + " booked a ticket.");
    }

    static void bookTicket(String name, String seatType) {
        System.out.println(name + " booked a " + seatType + " seat.");
    }

    void bookTicket(String name, String seatType, String meal) {
        System.out.println(name + " booked a " + seatType + " seat with " + meal + " meal.");
    }
}