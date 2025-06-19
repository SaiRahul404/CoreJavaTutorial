package org.example;

class Mobile {
    String model;
    int price;
    static String OS = "Android"; // Static variable (common for all mobiles)

    Mobile(String model, int price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println(model + " - $" + price + " - OS: " + OS);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 10000);
        m1.display();
    }
}
