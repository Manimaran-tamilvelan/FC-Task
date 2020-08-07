package com.fullcreative.remainingoops.test;

import org.junit.*;
import org.junit.Assert;

import com.fullcreative.remainingoops.MySingleton;

public class MySingletonTest {

	MySingleton m1,m2;
	
	@Before
	public void beforeMyTest() {
		m1 = MySingleton.myObj();
		m2 = MySingleton.myObj();
	}

	@Test
	public void SingletonTest() {
		Assert.assertEquals(m1, m2);
	}

}
