package com.fullcreative.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insertion & access is our requirement it's better for al

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);

		System.out.println(al);
		System.out.println(al.size());

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.addAll(al);
		
		// shifting is there so, it's slow compare to linked list
		al1.remove(0);
		al1.add(0, 5);
		al1.remove((Integer)5);
		System.out.println("Obj:" + al1);

		Iterator itr = al1.iterator();
		System.out.println("Iterated Elements:");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		al.removeAll(al1);
		System.out.println(al);
		


	}
	

}
