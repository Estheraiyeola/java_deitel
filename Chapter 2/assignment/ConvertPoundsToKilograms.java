package src.assignment;

import java.util.Scanner;

public class ConvertPoundsToKilograms{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		double number = input.nextDouble();
		
		double numberInKilogram = number * 0.454;
		
		System.out.println(number + " pounds is " + numberInKilogram + " kilograms");
	
	}


}
