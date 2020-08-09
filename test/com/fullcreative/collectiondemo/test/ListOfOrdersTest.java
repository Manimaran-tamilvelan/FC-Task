package com.fullcreative.collectiondemo.test;

import com.fullcreative.collectiondemo.*;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import org.junit.*;

public class ListOfOrdersTest {

	List<Map<Integer, String>> m;

	@Before
	public void Before() {
		m = new ArrayList<>();

	}

	@Test
	public void test() {

		Map<Integer, String> expected = new TreeMap<>();
		expected.put(1001, "book");
		// expected.put(1002, "book");

		m.add(expected);
		// System.out.println(m);

		String s = "book";
		// System.out.println(ListOfOrders.list(s));

		// System.out.println(ListOfOrders.list("book"));
		assertEquals(m, ListOfOrders.list(s));
	}

	@Test
	public void test1() {

		Map<Integer, String> expected = new TreeMap<>();
		expected.put(1002, null);
		// expected.put(1002, "book");

		m.add(expected);
		// System.out.println(m);

		String s = null;
		// System.out.println(ListOfOrders.list(s));

		// System.out.println(ListOfOrders.list("book"));
		assertEquals(m, ListOfOrders.list(s));
	}

}
