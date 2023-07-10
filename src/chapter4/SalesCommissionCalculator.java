package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the item number: ");
        int item = input.nextInt();

        double sum = 0.00;
        double commission;
        double amount = 0.00;
        double earnings;
        while (item != -1){
            if (item == 1){
                amount = 239.99;
            }
            else if (item == 2){
                amount = 129.75;
            }
            else if (item == 3){
                amount = 99.95;
            }
            else if (item == 4){
                amount = 350.89;
            }
            else System.out.println("Invalid input");
            sum += amount;
            System.out.print("Enter the item number: ");
            item = input.nextInt();
        }

        commission = (double) 9 / 100 * sum;
        earnings = 200 + commission;
        System.out.printf("$%.4f", earnings);
    }
}
