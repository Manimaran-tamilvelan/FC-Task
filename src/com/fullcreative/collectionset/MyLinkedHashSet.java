package com.fullcreative.collectionset;

import java.util.*;

public class MyLinkedHashSet {

	public static void main(String[] args) {

		// maintains insertion order
		LinkedHashSet h = new LinkedHashSet<>();
		h.add(10);
		// h.add(10); no use, duplicates not allowed
		h.add(null);
		h.add(30);
		h.add(20);
		h.add(15);

		System.out.println(h);

		// we need to exactly know the obj which one to be removed
		h.remove(15);
		System.out.println(h);

	}

}
