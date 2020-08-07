package com.fullcreative.dayonetask;

import java.util.Scanner;

public class StarPyramidPrintOddNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int a = sc.nextInt();

		printPattern(a);

	}

	public static void printPattern(int a) {

		int count = 1;

		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				System.out.print(count);

			}
			count += 2;
			System.out.println();
		}

	}

}
