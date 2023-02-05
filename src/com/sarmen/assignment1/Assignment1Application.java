package com.sarmen.assignment1;

import java.util.Scanner;

public class Assignment1Application {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double initinvest = CollectInput(scanner , "Type in your starting investment: ");
		
		double investrate = CollectInput(scanner , "Type in your interest rate: ");
		
		double newBalance = initinvest;
		
		for (int i = 5;i <= 30; i = i + 5) {
			double result = CalculateInvest(newBalance, investrate, i);
			System.out.println("After "+ i + " years, you would have: " + Math.round(result));
		}	

	}
	
	private static double CollectInput(Scanner scanner, String messagetodisplay) {
		System.out.println(messagetodisplay);
		return scanner.nextDouble();
		
	}
	
	private static double CalculateInvest(double newBalance , double investrate , int year) {
		for(int i=1;i<= year;i++) {
			newBalance = newBalance * (investrate + 1.0);
		}
		return newBalance;
	}

}
