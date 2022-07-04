package com.addressbook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch =scanner.nextInt();
		
		System.out.println("1.Add\n  2.Edit\n  3.delete\n 4.Exit");
		
		while(ch>=1) {
			switch(ch) {
			AddressBook book = new AddressBook();
			case1: add();
			break;
			}
		}
		
		
		book.add();

	}

}
