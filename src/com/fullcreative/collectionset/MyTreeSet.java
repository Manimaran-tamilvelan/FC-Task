package com.fullcreative.collectionset;

import java.util.*;

public class MyTreeSet {
	public static void main(String[] args) {
		
		// maintains ascending order
				TreeSet h = new TreeSet<>();
				h.add(10);
				// h.add(10); no use, duplicates not allowed
				//h.add(null); npe
				h.add(30);
				h.add(20);
				h.add(15);

				System.out.println(h);

				// we need to exactly know the obj which one to be removed

				h.remove(15);
				System.out.println(h);
		
	}

}
