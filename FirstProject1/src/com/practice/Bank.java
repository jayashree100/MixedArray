package com.practice;

import java.util.Scanner;

public class Bank {
	
	public void debitAmount(double amount) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount");
		amount = scanner.nextDouble();
		double currentBalance = 0;
		if(currentBalance>=0) {
			currentBalance = currentBalance + amount;
			System.out.println("Current Balance is" +currentBalance);
		}
		
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.debitAmount(0);

	}

}
