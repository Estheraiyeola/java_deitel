package chapter2;

import java.util.Scanner;

public class RunwayLength{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double length = (speed * speed) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is " + length);
	
	}

}
