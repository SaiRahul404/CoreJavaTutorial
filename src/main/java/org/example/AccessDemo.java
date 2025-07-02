package org.example;

public class AccessDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
//        c1.publicValue = 10;
//        c1.setPrivateValue(23);
//        c1.computeSum();
        c1.add(2,4);
        c1.add(3.5,4.5);
        c1.add("Hello", "World");


    }
}

class DataHolder {
    int publicValue;         // accessible by subclasses
    private int privateValue; // accessible only within DataHolder

    int getPrivateValue() {
        return privateValue;
    }

    void setPrivateValue(int privateValue) {
        this.privateValue = privateValue;
    }

}

class Calculator extends DataHolder {
    int total;
    void computeSum() {
         // total = publicValue + privateValue; // ❌ This will cause an error!
        // Because privateValue is private in DataHolder and can't be accessed here.

        total = publicValue + getPrivateValue();
        System.out.println(total);

    }

    void add(int a, int b) {
        System.out.println("int version: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("double version: " + (a + b));
    }

    void add(String a, String b) {
        System.out.println("String version: " + a + b);
    }
}

// Members declared private are not visible outside the class, not even in subclasses.
// Best way to access or modify private fields from outside the class (like from a subclass). - getter methods and setter methods

// c1 { publicValue = 10
// privateValue = 23
//}