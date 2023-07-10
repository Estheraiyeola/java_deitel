package chapter2;

import java.util.Scanner;

public class ConvertFeetIntoMeters{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double value = input.nextDouble();
		
		double valueInMeters = value * 0.305;
		
		System.out.println(value + " feet is " + valueInMeters + " meters");
	
	}

}
