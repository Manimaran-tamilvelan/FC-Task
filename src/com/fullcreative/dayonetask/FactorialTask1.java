package com.fullcreative.dayonetask;

import java.util.Scanner;

public class FactorialTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input:");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			fact *= i;
		}

		System.out.println("The factorial of given number is: "+fact);
	}

}
