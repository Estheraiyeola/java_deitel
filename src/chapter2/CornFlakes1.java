package chapter2;

import java.util.Scanner;
public class CornFlakes1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int total = 0;
        double average = 0.0;
        String requiredClass = "SS3";
        System.out.println("Enter your class: ");
        String class_ = input.next();

        if (class_ == requiredClass) {
            while (counter < 20) {
                System.out.println("Enter your grade: ");
                int grade = input.nextInt();
                total += grade;

                counter += 1;
            }
            if (counter == 20) {
                average = (double) total / counter;
            }
        }
        System.out.println('*' * 70);
        System.out.println("       Aso Rock Secondary School, Abuja Nigeria");
        System.out.println('*' * 70);
        System.out.println("Class: " + class_);
        System.out.println("Number of Student in class: " + counter);
        System.out.println("Total score: " + total);
        System.out.println("Average Score: " + average);
    }

}