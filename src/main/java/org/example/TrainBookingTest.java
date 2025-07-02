package org.example;

public class TrainBookingTest {
    public static void main(String[] args) {
        TrainBooking booking = new TrainBooking();
        booking.bookTicket("Alice");
        booking.bookTicket("Bob", "Window");
        booking.bookTicket("Charlie", "Aisle", "Vegetarian");
    }
}

class TrainBooking {
    void bookTicket(String name) {
        System.out.println(name + " booked a ticket.");
    }

    void bookTicket(String name, String seatType) {
        System.out.println(name + " booked a " + seatType + " seat.");
    }

    void bookTicket(String name, String seatType, String meal) {
        System.out.println(name + " booked a " + seatType + " seat with " + meal + " meal.");
    }
}