package com.fullcreative.mycollection.test;

import com.fullcreative.mycollection.MyStack;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Stack;

import org.junit.*;

import org.junit.Assert;

public class MyStackTest {

	Stack<Character> stk;
	List expectedList;

	@Before
	public void beforeTest() {
		stk = new Stack<>();
		stk.push('1');
		stk.push('2');
		stk.push('4');
		stk.push('8');

		expectedList = new Stack();
		expectedList.add('8');
		expectedList.add('4');
		expectedList.add('2');
		expectedList.add('1');

	}

	@Test
	public void reverseProgTest() {

		List<Character> l = MyStack.reverseProg(stk);

		assertNotNull(l);
		assertEquals(expectedList, l);

	}

}
