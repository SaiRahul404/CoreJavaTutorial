package org.example;

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount sb1 = new SavingsAccount(); // created an object for child class
        sb1.balance = 10000;
        sb1.showBalance();
        sb1.addInterest();
        sb1.showBalance();
        sb1.addInterest();
        sb1.showBalance();
        BankAccount b1 = new BankAccount(); // creating an object for parent class
        b1.balance = 100;
        b1.showBalance(); // method inside the parent class
    }
}

// parent class
class BankAccount {
    double balance;

    void showBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {
    void addInterest() {
        double interest = balance * 0.05;
        balance += interest; // balance = balance + interest
        System.out.println("Interest added: $" + interest);
    }

    @Override
    void showBalance() {
        System.out.println("The new savings balance: $" + balance);
    }
}
// The child class doesn't need to duplicate the fields or methods already available in the parent class.
// Makes your codebase easier to extend and maintain.

// Method overriding means a child class provides a new version of a method that it inherits from a parent class — with the same method name, return type, and parameters.

// You override a method when:
//
//The base (parent) method is close, but not exactly what the child needs.

