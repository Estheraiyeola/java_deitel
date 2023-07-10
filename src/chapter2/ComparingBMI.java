package chapter2;

import java.util.Scanner;


public class ComparingBMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		double newWeight = weight * 0.45359237;
		
		double newHeight = height * 0.0254;
		
		double squareOfHeight = newHeight * newHeight;
		
		double bMI = newWeight / squareOfHeight;
		
		System.out.println("BMI is " + bMI);
	
	}


}
