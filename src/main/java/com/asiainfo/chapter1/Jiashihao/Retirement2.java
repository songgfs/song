package com.asiainfo.chapter1.Jiashihao;

import java.util.*;
public class Retirement2 {
	private static int year;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %");
		double interestRate = in.nextDouble();
		
		double balance=0;
		int years=0;
		
		String input;
		do
		{
			balance +=payment;
			double interest = balance*interestRate/100;
			balance +=interest;
			
			year++;
			
			System.out.printf("After year %d,your balance is 5,2f%n,year,balance");
			
			System.out.print("Ready to retire?(Y/N)");
			input = in.next();
		}
		while (input.equals("N"));
	}

}
