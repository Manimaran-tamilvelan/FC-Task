package com.fullcreative.collectionqueue;

import java.util.*;

public class MyArrayDeque {
	
	public static void main(String[] args) {
		
		Deque d = new ArrayDeque<>();
		d.add(10);
		d.add(20);
		d.add(20);
		d.add(30);
		//d.add(null); npe
		d.addFirst(05);
		
		d.remove();
		d.poll();
		d.pollLast();
		System.out.println(d);
		
	}

}
