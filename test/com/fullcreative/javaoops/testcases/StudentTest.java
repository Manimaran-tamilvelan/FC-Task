package com.fullcreative.javaoops.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fullcreative.javaoops.*;

import junit.framework.Assert;

public class StudentTest {
	
	Knowledge k1,k2;
	Student st;

	@Before
	public void setter() {
		k1 = new Knowledge();
		k1.setter("Java", "Prog");
		k2 = new Knowledge();
		k2.setter("HTML", "Script");
		
		List<Knowledge> lst = new ArrayList<>();
		lst.add(k1);
		lst.add(k2);
		
		st = new Student(lst);
	}
	
	@Test
	public void testStuKnownledge() {
		Object obj1 = "Java-Prog";
		Object obj2 = "HTML-Script";
		Object actual1[] = new Object[2];
		int i1 = 0;
		for (Knowledge i : st.mayKnows()) {
			
			 actual1[i1] = i.getter();
			 i1++;
		}
		assertEquals(obj1,actual1[0]);
		assertEquals(obj2,actual1[1]);
		
	}

}
