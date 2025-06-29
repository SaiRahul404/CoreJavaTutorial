package org.example;

public class AccessDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.publicValue = 10;
        c1.setPrivateValue(23);
        c1.computeSum();

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
}

// Members declared private are not visible outside the class, not even in subclasses.
// Best way to access or modify private fields from outside the class (like from a subclass). - getter methods and setter methods

// c1 { publicValue = 10
// privateValue = 23
//}