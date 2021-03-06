package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
	
	List<Person> person = new ArrayList<>();
	Map<String ,ArrayList<Person>> addressBookList = new HashMap<String,ArrayList<Person>>();

	
	public void add() {
		Scanner scanner = new Scanner(System.in);
		Person persons = new Person();
		System.out.println("Enter the first name");
		//String firstName = scanner.nextLine();
		persons.setFirstName(scanner.next());
		System.out.println("Enter the last name");
		persons.setLastName(scanner.next());
		System.out.println("Enter the city");
		persons.setCity(scanner.next());
		System.out.println("Enter the state name");
		
		persons.setState(scanner.next());
		System.out.println("Enter the zip code");
	
		persons.setZip(scanner.nextInt());
		System.out.println("Enter the phone number name");
		
		persons.setPhoneNumber(scanner.nextLong());
		
		person.add(persons);
	
		System.out.println("Enter the book name you want add the person");
		String bookname = scanner.next();
		
		if(addressBookList.containsKey(bookname)) {
			ArrayList<Person> personlist = addressBookList.get(bookname);
			addressBookList.put(bookname, personlist);
		} else {
			ArrayList<Person> personlist = addressBookList.get(bookname);
			addressBookList.put(bookname, personlist);
			System.out.println(bookname+ " created ");
			System.out.println("New Contact added to the " +bookname);
		
		}
		
	
	}
}
