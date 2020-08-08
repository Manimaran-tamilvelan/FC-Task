package com.fullcreative.mycollection;

import com.fullcreative.mycollection.*;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class myVector {

	//better to go when multiple resources trying to write in single data at a time using thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector();
		v.add(10);
		// v.addElement(20);
		v.add(1, 15);
		v.add(5);

		v.remove((Integer) 15);
		System.out.print("Insertion Order: ");
		System.out.println(v);

		// remove(e), clear, removeAll,size()
		System.out.print("Ascending Order: ");
		Collections.sort(v);
		System.out.println(v);

	}

}
