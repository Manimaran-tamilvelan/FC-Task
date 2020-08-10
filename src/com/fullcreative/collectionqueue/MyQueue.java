package com.fullcreative.collectionqueue;

import java.util.*;

public class MyQueue {
	
	public static void main(String[] args) {
		
		Queue q  = new PriorityQueue(); 
		q.add(10);
		q.offer(20);
		q.add(10);
		//q.add(null);  npe

		System.out.println(q.element());
		//System.out.println(q.peek()); same as q.element()
		
		//making my element to ascending order and then it removes it
		System.out.println(q.poll());
		System.out.println(q.poll());
		//q.poll();
		//q.remove();
		System.out.println(q);
	}
	

}
