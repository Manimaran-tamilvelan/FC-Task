package com.fullcreative.collectiondemo.test;

import com.fullcreative.collectiondemo.OrderDetail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.*;
import org.junit.Assert;

public class OrderDetailTest {

	Map<Integer, String> m;
	@Before
	public void Before() {
		m= new TreeMap<>();
		
	}
	
	@Test
	public void Test() {
		OrderDetail.placeOrder(null);	
		m.put(1001, null);
		assertEquals(m, OrderDetail.getter());
	}
	
	@Test
	public void Test1() {

		OrderDetail.placeOrder("book");
		m.put(1002, "book");
		assertEquals(m, OrderDetail.getter());
	}
	
	
}
