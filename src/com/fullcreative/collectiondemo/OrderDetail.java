package com.fullcreative.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class OrderDetail {
	
	private static Map<Integer, String> m;
	private static int oid = 1001;

	public static void placeOrder(String s) {

		m = new HashMap();
		m.put(oid, s);
		oid++;

	}

	public static  Map<Integer, String> getter() {
		return m;
	}
	
	
}
