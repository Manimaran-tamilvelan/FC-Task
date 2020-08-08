package com.fullcreative.mycollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if we want insertion order with key value pair
		
		LinkedHashMap<Integer, Integer> l = new LinkedHashMap<>();
		l.put(null, null);
		l.put(5, 6);
		l.put(5, 7);
		l.put(4, 7);
		
		l.remove(5);
		
		System.out.println(l);
		
		for(Map.Entry m:l.entrySet()) {
			System.out.println(m.getKey()+" - "+m.getValue());
		}
		
		
	}

}
