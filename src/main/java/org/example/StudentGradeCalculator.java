package org.example;

import java.util.Scanner;

public class StudentGradeCalculator {

    /* Project: Student Grade Calculator
     Objective: Create a Java program that:
     Prompts the user to enter the number of students.
     For each student, prompts for their name.
     For each student, prompts for the number of subjects.
     For each subject, prompts for the grade.
     Calculates the average grade for each student.
     Assigns a letter grade (A, B, C, D, F) based on the average.
     Displays the student's name, individual subject grades, average grade, and letter grade.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Student Grade Calculator ---");

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            // 3. Get student's name
            System.out.print("Enter student's name: ");
            String studentName = input.nextLine();

            // 4. Get the number of subjects for the current student
            System.out.print("Enter the number of subjects for " + studentName + ": ");
            int numberOfSubjects = input.nextInt();
            input.nextLine(); // Consume the newline

            double[] grades = new double[numberOfSubjects];
            double sumOfGrades = 0.0;


            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter grade for subject " + (j + 1) + ": ");
                grades[j] = input.nextDouble();
                sumOfGrades += grades[j]; // Add grade to sum
            }
            input.nextLine();
            double averageGrade = sumOfGrades / numberOfSubjects;

            char letterGrade;
            if (averageGrade >= 90) {
                letterGrade = 'A';
            } else if (averageGrade >= 80) {
                letterGrade = 'B';
            } else if (averageGrade >= 70) {
                letterGrade = 'C';
            } else if (averageGrade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.println("\n--- Results for " + studentName + " ---");
            System.out.println("Subject Grades:");
            for (int k = 0; k < numberOfSubjects; k++) {
                System.out.println("  Subject " + (k + 1) + ": " + grades[k]);
            }
            System.out.printf("Average Grade: %.2f%n", averageGrade); // Using printf for formatted output
            System.out.println("Letter Grade: " + letterGrade);



        }
        input.close();
        System.out.println("\n--- Grade calculation complete. ---");


    }
    // Display Highest and Lowest Grade per Student:

}
// Important Note on input.nextLine() after nextInt()/nextDouble(): When you use nextInt() or nextDouble(), they only read the number and leave the newline character (\n) in the input buffer. If you immediately follow it with nextLine(), it will consume that leftover newline and appear as if the user didn't enter anything. To fix this, we call input.nextLine() right after nextInt() or nextDouble() to "consume" the leftover newline.
