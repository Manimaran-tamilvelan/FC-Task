package com.fullcreative.remainingoops.test;

import org.junit.Before;
import org.junit.Test;


import com.fullcreative.remainingoops.*;

import junit.framework.Assert;

public class CreateTest {
	
	String actual;

	@Before
	public void beforeTest() {
		// interface, loose coupling
		// Runtime polymorphism
		Wood i = new Chair();
		actual = i.toDo();
		
	}

	@Test
	public void testLooseCoupling() {
		Assert.assertEquals("Create Chair", actual);
	}

}
