package com.fullcreative.collectiondemo;

import java.util.*;
import com.fullcreative.collectiondemo.OrderDetail;

public class ListOfOrders {

	static int i = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Map<Integer, String>> l = new Vector<>();

		System.out.println("How Many order you want to place:");
		int loop = sc.nextInt();

		for (int i = 1; i <= loop; i++) {

			System.out.print("Enter " + i + "st order: ");
			String s = sc.next();

			OrderDetail.placeOrder(s);
			l.add(OrderDetail.getter());

		}

		System.out.println("Order Placed Note Order ID");
		System.out.println(l);

	}

}
