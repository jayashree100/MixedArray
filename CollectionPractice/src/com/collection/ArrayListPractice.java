package com.collection;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListPractice {
	String name;
	int id;
	double salary;
	
	

	public ArrayListPractice(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	


	@Override
	public String toString() {
		return "ArrayListPractice [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}




	public static void main(String[] args) {
//		List list = new ArrayList();
//		//list.add("jaya");
//		////list.add("kavya");
		ArrayListPractice pra = new ArrayListPractice("jaya",101,20000.00);
//	list.add(pra);
//	System.out.println(list);
		Set set = new HashSet();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(101);
		set.add(pra);
		System.out.println(pra.toString());
		
		System.out.println(set);
	}


}