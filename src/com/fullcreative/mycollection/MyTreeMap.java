package com.fullcreative.mycollection;

import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> t = new TreeMap<>();
		t.put(10, 20);
		//t.put(null, 10); CTE
		t.put(15, 15);
		t.put(10, 25);
		t.put(5, 15);
		
		
		
		System.out.println(t);
		
		//after ascending it searches the first/last key not by insertion order
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		
	}

}
