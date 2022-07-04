package com.practice;

import java.util.ArrayList;

public class ArrayPracice {
	
	public void arrayType(Object[] arr) {
		String res = " ";
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] instanceof Integer) {
				 
			}
			//System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Object arr[] = {10,20,30,"jaya",10.0f};
		for(Object a : arr) {
			System.out.println(a instanceof Integer);
		}
		//ArrayPracice  pract = new ArrayPracice();
	
		//pract.arrayType(arr);
	}

}
