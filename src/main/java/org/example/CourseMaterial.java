package org.example;

abstract class CourseMaterial {
    String title;

    CourseMaterial(String title) {
        this.title = title;
    }

    abstract void generateContent();

    void preview() {
        System.out.println("Previewing: " + title);
    }
}

class VideoLecture extends CourseMaterial {
    VideoLecture(String title) {
        super(title);
    }

    @Override
    void generateContent() {
        System.out.println("Generating video lecture: " + title);
    }
}

class PdfNotes extends CourseMaterial {
    PdfNotes(String title) {
        super(title);
    }

    @Override
    void generateContent() {
        System.out.println("Generating PDF notes: " + title);
    }
}