package chapter4;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles and -25 to exit: ");
        int miles = input.nextInt();
        System.out.println("Enter the number of gallons: ");
        int gallon = input.nextInt();

        float milesPerGallon;
        int sumMiles = 0;
        int sumGallon = 0;
        float overAllMilesPerGallon;
        if (miles > 0 && gallon > 0){
            while (miles != -2){
                sumMiles = sumMiles + miles;
                sumGallon = sumGallon + gallon;
                milesPerGallon = (float) miles / gallon;
                System.out.println(milesPerGallon);

                System.out.println("Enter the number of miles and -25 to exit: ");
                miles = input.nextInt();
                System.out.println("Enter the number of gallons: ");
                gallon = input.nextInt();
            }
        }
        overAllMilesPerGallon = (float) sumMiles / sumGallon;
        System.out.println(overAllMilesPerGallon);


    }

}
