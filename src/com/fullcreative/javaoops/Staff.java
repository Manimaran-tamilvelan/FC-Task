package com.fullcreative.javaoops;

import java.util.*;

public class Staff {

	public static void main(String[] args) {

		Knowledge k1 = new Knowledge();
		k1.setter("Java", "OOPS");		
		Knowledge k2 = new Knowledge();
		k2.setter("Unit Test", "Junit");
		Knowledge k3 = new Knowledge();
		k3.setter("Maths","Theory");
		//Staff st = new Staff();
		//k3.sub;

		List<Knowledge> knows = new ArrayList<>();
		knows.add(k1);
		knows.add(k2);
		knows.add(k3);
		//knows.st();

		Student stu = new Student(knows);

		List<Knowledge> stuKnownList = stu.mayKnows();

		System.out.println("Students Knows:");
		for (Knowledge i : stuKnownList) {
			System.out.println(i.getter());
		}

	}

}
