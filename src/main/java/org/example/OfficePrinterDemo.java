package org.example;

public class OfficePrinterDemo {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.printDocument("Hello World");
        ColorPrinter c1 = new ColorPrinter();
        c1.printDocument("Hey, Welcome");
    }
}


class Printer {
    void printDocument(String content) {
        System.out.println("Printing in black and white: " + content);
    }
}

class ColorPrinter extends Printer {
    @Override
    void printDocument(String content) {
        System.out.println("Color printing enabled. " + content);
    }
}