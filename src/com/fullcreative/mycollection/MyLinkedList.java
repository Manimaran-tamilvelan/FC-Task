package com.fullcreative.mycollection;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		
		//requirement is manipulation better 
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(0,5);
		ll.add(20);
		ll.add(50);
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.contains(10));
		System.out.println(ll.size());
		
		//ll.remove(); removes first element(0th index)
		ll.remove(1);
		System.out.println(ll);
		ll.set(0, 5);//change the existing one with new value won't create element
		System.out.println(ll);
	
	}

}
