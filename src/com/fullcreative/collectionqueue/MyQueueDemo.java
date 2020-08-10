package com.fullcreative.collectionqueue;

import java.util.*;

public class MyQueueDemo {

	static ArrayDeque q;
	static int no;

	public static void main(String[] args) {
		// in arraydeque insertion & deletion could be done at both sides
		q = new ArrayDeque<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of people in queue");
		no = sc.nextInt();

		for (int i = 1; i <= no; i++) {
			System.out.print("Person "+i+": ");
			String p = sc.next();
			q.add(p);
		}

		ArrayDeque a1 = service(q);

	}

	public static ArrayDeque service(ArrayDeque q) {
		int loop = q.size();
		for(int i=1;i<=loop;i++) {
			System.out.println("service .."+q.poll()+"..  Ends");
		}
		
		return q;

	}

}
