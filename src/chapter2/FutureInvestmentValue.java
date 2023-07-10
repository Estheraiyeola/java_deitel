package chapter2;

import java.util.Scanner;

public class FutureInvestmentValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		double futureInvestmentValue1 = 1 + (interestRate / 100);
		
		double futureInvestmentValue2 = Math.pow(futureInvestmentValue1, numberOfYears);
		
		double futureInvestmentValue3 = investmentAmount * futureInvestmentValue2;
		
		System.out.println("Accumulated value is $" + futureInvestmentValue3);
	
	}

}
