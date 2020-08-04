package com.fullcreative.dayonetask;

public class MethodOverloadingTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(2, 3);
		add(2.5, 2.5);
		add(2, 3, 4);

	}

	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void add(double a, double b) {
		System.out.println(a + b);
	}

	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}
