package com.fullcreative.javaoops;

import java.util.List;

public class Student {

	public List<Knowledge> known;

	public Student(List<Knowledge> known) {
		this.known = known;
	}

	public List<Knowledge> mayKnows() {
		return known;
	}

}
