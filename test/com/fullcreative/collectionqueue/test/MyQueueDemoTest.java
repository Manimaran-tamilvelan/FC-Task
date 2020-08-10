package com.fullcreative.collectionqueue.test;

import com.fullcreative.collectionqueue.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;

import org.junit.*;
import org.junit.Assert;

public class MyQueueDemoTest {
	
	ArrayDeque ad;
	@Before
	public void before(){
		ad = new ArrayDeque<>();
	}
	
	@Test
	public void testservice() {
		ad.add(10);
		ad.add(20);
		ad.add(10);
		
		ArrayDeque expected = MyQueueDemo.service(ad);
		
		assertEquals(ad, expected);
		
		
	}
	
}
