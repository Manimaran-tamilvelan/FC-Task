package com.fullcreative.mycollection;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//want to store as key-value pair
		//no insertion order,no duplicates
		HashMap<Integer, Integer> h = new HashMap();
		h.put(5,6);
		h.putIfAbsent(5, 7);//not reflected becauase 5 key already have
		h.put(null, 7);
		h.put(null, 8);
		h.put(10, 9);
		h.put(6, 8);
		h.put(9, 9);
		h.put(7, 8);
		
		
		h.replace(null, 9);
		//h1.putAll(h);
		//h.remove(null);
		//h.remove(null,8);
		
		//collection view of mappings []
		//System.out.println(h.entrySet());
		//System.out.println(h.keySet());
		
		System.out.println(h.get(null));
		System.out.println(h);
		
		//h.forEach((key,value) -> System.out.println(key+"-"+value));
		Iterator i = h.entrySet().iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
