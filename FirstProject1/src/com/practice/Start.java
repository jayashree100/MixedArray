package com.practice;

public class Start {
	private void printFibonacciSeries(int[] arr) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        for (int i = 2; num1 < arr.length; i++) {

            System.out.println(num1 + " " + arr[num1]);
            num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }
    }


	 
	public static void main(String[] args) {

		        int arr[] = {10, 20, 30, 40, 50, 60};

		        int n = 10;
		        Start start = new Start();
		        start.printFibonacciSeries(arr);
		    }
		}

	


