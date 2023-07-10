package chapter2;

import java.util.Scanner;

public class CalculatingEnergy{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in Kilograms: ");
		double amountOfWaterInKg = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energyNeeded = amountOfWaterInKg * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is " + energyNeeded +" joules" );
	
	}

}
