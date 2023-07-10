package chapter2;

import java.util.Scanner;


public class Acceleration{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter starting velocity(v0) in meters, ending velocity(v1) in meters and time span(t) in seconds: ");
		double startingVelocity = input.nextDouble();
		double endingVelocity = input.nextDouble();
		double time = input.nextDouble();
		
		double averageAcceleration = (endingVelocity - startingVelocity) / time;
		
		System.out.println("The average acceleration is " + averageAcceleration);
	
	}

}
