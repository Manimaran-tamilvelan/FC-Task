package com.fullcreative.collectionset;

import org.junit.*;
import java.util.*;

public class MyHashSet {
	
	public static void main(String[] args) {
		
		//insertion order not preserved
		HashSet h = new HashSet<>();
		h.add(10);
		//h.add(10); no use, duplicates not allowed
		h.add(null);
		h.add(30);
		h.add(20);
		h.add(15);
		
		
		System.out.println(h);
		
		//insertion order not preserved so, we need to exactly know the obj which one to be removed
		h.remove(15);
		System.out.println(h);
	}

}
