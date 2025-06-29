package org.example;

public class LibrarySystem {
    public static void main(String[] args) {

        EBook e1 = new EBook();
        e1.author = "Ramana";
        e1.title = "My Book";
        e1.printInfo();
        e1.download();
    }
}

class Book {
    String title;
    String author;

    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }


}

class EBook extends Book {
    void download() {
        System.out.println("Downloading '" + title + "' by " + author);
    }
}

