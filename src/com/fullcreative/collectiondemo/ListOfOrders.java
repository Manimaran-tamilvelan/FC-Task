package com.fullcreative.collectiondemo;

import java.util.*;
import com.fullcreative.collectiondemo.OrderDetail;

public class ListOfOrders {

	static int i = 1;

	static int loop;
	static Scanner sc;
	static List<Map<Integer, String>> l;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		l = new ArrayList<>();

		System.out.println("How Many order you want to place:");
		loop = sc.nextInt();

		getList(loop);

	}

	public static void getList(int loop) {
		for (int i = 1; i <= loop; i++) {

			System.out.print("Enter " + i + "st order: ");
			String s = sc.next();
			
			l.addAll(list(s));

		}

		System.out.println("Order Placed Note Order ID");
		System.out.println(l);
	}

	public static List<Map<Integer, String>> list(String s) {
		 List<Map<Integer, String>> l1  = new ArrayList<>();;
		
		OrderDetail.placeOrder(s);
		l1.add(OrderDetail.getter());
		
		return l1;

	}

}
