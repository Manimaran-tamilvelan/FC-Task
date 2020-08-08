package com.fullcreative.mycollection;

import java.util.*;

public class MyStack {

	// stack specific methods - empty(), push(ele), pop(), peek(), search(Obj)

	
	static Stack<Character> l;
	static int loop;
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Char you want to enter:");
		 loop = sc.nextInt();
		
		
		 Stack<Character> l = new Stack<>();
		// System.out.println(l.empty());

		System.out.println("Enter " + loop + " Character:");
		for (int i = 1; i <= loop; i++) {
			char ch = sc.next().charAt(0);
			l.push(ch);
		}
		
		System.out.println(reverseProg(l));

	}

	public static List reverseProg(Stack<Character> l) {

		int loop = l.size();
		List<Character> ls = new Stack<>();

		// System.out.println(l.search('5'));
		// System.out.println("Checking Insertion order:"+l);
		System.out.println("Reverse of your Input is:");
		for (int i = 1; i <= loop; i++) {
			ls.add(l.pop());
		}
		
		return ls;

	}

}
