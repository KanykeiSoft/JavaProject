package Arrays;

import java.util.Scanner;

public class MarkCalculator {
    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter the total number of subjects: ");
                int totalSubjects = input.nextInt();
                input.nextLine();

                String[] subjects = new String[totalSubjects];

                for (int i = 0; i < totalSubjects; i++) {
                    System.out.print("Enter the name of subject " + (i + 1) + ": ");
                    subjects[i] = input.nextLine();
                }
                System.out.print("Enter the number of marks you want to enter for each subjects:  ");
                int totalMarksPerSubject = input.nextInt();

                double[][] marks = new double[totalSubjects][totalMarksPerSubject];

                for (int i = 0; i < totalSubjects; i++) {
                    for (int j = 0; j < totalMarksPerSubject; j++) {
                        System.out.printf("Enter marks " + (j + 1) + " for " + subjects[i] + ": ");
                        marks[i][j] = input.nextDouble();
                    }
                }
                for (int i = 0; i < totalSubjects; i++) {
                    printSubject(subjects[i], marks[i]);
                }

            }

        }private static void printSubject(String subject, double[] marks){
            double totalMarks = 0;
            double maxMarks = marks[0];
            double minMarks = marks[0];

            for (double mark: marks) {
                totalMarks += mark;
                if (mark < minMarks) minMarks = mark;
                if (mark < maxMarks) maxMarks = mark;
            }
            double average = totalMarks / marks.length;
            System.out.println("============================");
            System.out.println("Stats for " + subject);
            System.out.println("=============================");
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Maximum Marks:" + maxMarks);
            System.out.println("Minimum Marks:" + minMarks);




        }
    }

