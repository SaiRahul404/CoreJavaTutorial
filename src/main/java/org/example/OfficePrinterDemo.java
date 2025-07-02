package org.example;

public class OfficePrinterDemo {
    public static void main(String[] args) {
//        Printer p1 = new Printer();
//        p1.printDocument("Hello World");
//        ColorPrinter c1 = new ColorPrinter();
//        c1.printDocument("Hey, Welcome");
        Printer p1;
        p1 = new ColorPrinter();
        p1.printDocument("Hey");
    }
}


class Printer {
    void printDocument(String content) {
        System.out.println("Printing in black and white: " + content);
    }

    void print(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("String-int version: " + message);
        }
    }


    void print(int times, String message) {
        for (int i = 0; i < times; i++) {
            System.out.println("int-String version: " + message);
        }
    }
}

class ColorPrinter extends Printer {
    @Override
    void printDocument(String content) {
        //super.printDocument(content);
        System.out.println("Color printing enabled. " + content);
    }
}