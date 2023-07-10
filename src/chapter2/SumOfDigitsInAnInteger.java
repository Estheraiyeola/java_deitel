package chapter2;

import java.util.Scanner;

public class SumOfDigitsInAnInteger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		
			if(number >= 100){
				int sum = number % 10;
				int int1 = sum;
				
				sum = number / 10;
				int int2 = sum % 10;
				
				int int3 = number / 100;
				
				int sumOfThreeDigitNumbers = int1 + int2 + int3;
				
				System.out.println("The sum of the digits is " + sumOfThreeDigitNumbers);
			
			}
			if(number < 100){
				int sum = number % 10;
				int int1 = sum;
				
				sum = number / 10;
				int int2 = sum % 10;
				
				int sumOfTwoDigitNumbers = int1 + int2;
				
				System.out.println("The sum of the digits is " + sumOfTwoDigitNumbers);
			}
		
		
	
	}

}
