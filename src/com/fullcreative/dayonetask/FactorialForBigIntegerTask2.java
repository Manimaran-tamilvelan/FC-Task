package com.fullcreative.dayonetask;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialForBigIntegerTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input:");
		int input = sc.nextInt();

		BigInteger more_digit = factorial(input);
		System.out.println("The factorial of given number is");
		System.out.println(more_digit);

	}

	public static BigInteger factorial(int N) {
		BigInteger f = new BigInteger("1");

		for (int i = 2; i <= N; i++)
			f = f.multiply(BigInteger.valueOf(i));
		return f;
	}

}
