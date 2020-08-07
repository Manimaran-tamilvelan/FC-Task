package com.fullcreative.javaoops.testcases;

import org.junit.*;
import org.junit.Assert;

import com.fullcreative.javaoops.Knowledge;

public class KnowledgeTest {
	Knowledge k;

	@Before
	public void setter() {
		k = new Knowledge();
		k.setter("Java", "Prog");
	}

	@Test
	public void testMyBean() {
		Object obj = "Java-Prog";
		Assert.assertEquals(obj, k.getter());
	}

}
