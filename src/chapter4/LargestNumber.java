package chapter4;

import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int largest = 0;
        while(counter < 10){
            System.out.print("Enter the numbers: ");
            int number = input.nextInt();
            if (number > largest){
                largest = number;
            }
            counter++;
        }
        System.out.println(largest);
    }
}
