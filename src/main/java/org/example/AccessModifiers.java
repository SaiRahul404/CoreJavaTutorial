package org.example;

public class AccessModifiers {

    // public
    // private
    // default
    //  The public keyword makes a class, method, or variable accessible from any other class in any package.
    public static void main(String[] args) {
        BookReader b2 = new BookReader();
        b2.readBook();
        b2.helloWorld();
    }

}
