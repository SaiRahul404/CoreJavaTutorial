package org.practice;

import org.example.BookReader;

public class TestPackage {
    public static void main(String[] args) {
        BookReader b1 = new BookReader();
        b1.readBook();
        // b1.helloWorld();

        // here helloworld is not able to call, beacuse it is having default modifier
    }
}
