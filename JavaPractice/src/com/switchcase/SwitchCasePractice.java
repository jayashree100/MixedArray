package com.switchcase;

import java.util.Scanner;

public class SwitchCasePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		switch(number) {
		case 10: 
			System.out.println(number+ " number matched" );
			break;
		case 20: 
			System.out.println(number+ " number matched");
			break;
		case 30: 
			System.out.println(number+ " number matched");
			break;
		default:
			System.out.println("invalid input try to give the proper input");
				
		
		}

	}

}
