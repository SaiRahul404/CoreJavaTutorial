package org.example;

abstract class FinancialAccount {
    String accountHolder;
    double balance;

    FinancialAccount(String name, double bal) {
        this.accountHolder = name;
        this.balance = bal;
    }

    abstract double calculateInterest();

    void displayBalance() {
        System.out.println(accountHolder + "'s balance: $" + balance);
    }
}

class SavingsAccountNew extends FinancialAccount {
    SavingsAccountNew(String name, double bal) {
        super(name, bal);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }

}

class FixedDepositAccount extends FinancialAccount {

    FixedDepositAccount(String name, double val) {
        super(name, val);
    }

    @Override
    double calculateInterest() {
        return balance * 0.08;
    }

}
// An abstract class is like a template that provides general rules, but does not allow direct object creation.
// other subclasses must extend (inherit from) the abstract class and provide specific implementations for the abstract methods.
// The abstract class defines the structure but does not provide all the details.
// If a method is abstract, all subclasses MUST override it.

//  Abstraction = Hiding Details + Showing Only What’s Necessary
// Achieved using abstract classes and abstract methods
//  Used in banking, games, e-commerce, and many real-world applications

// Hierarchical Inheritance
// Multiple classes inherit from one parent class.
//Like a father having two children, both inherit from the same parent.

// Single Inheritance
// One class inherits from one other class.
//Imagine a Son inherits traits from his Father

// Multilevel Inheritance
// Class A  → Parent (Base class)
//   ↓
//Class B  → Child of A
//   ↓
//Class C  → Child of B (inherits from both A and B)