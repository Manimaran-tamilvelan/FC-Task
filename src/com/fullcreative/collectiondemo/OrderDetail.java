package com.fullcreative.collectiondemo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class OrderDetail {
	
	private static Map<Integer, String> m;
	private static int oid = 1001;

	public static void placeOrder(String s) {

		m = new TreeMap();
		m.put(oid, s);
		oid++;

	}

	public static  Map<Integer, String> getter() {
		return m;
	}
	
	
}
