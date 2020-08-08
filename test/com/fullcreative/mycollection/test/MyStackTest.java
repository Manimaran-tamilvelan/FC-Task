package com.fullcreative.mycollection.test;

import com.fullcreative.mycollection.MyStack;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Stack;

import org.junit.*;

import org.junit.Assert;

public class MyStackTest {

	static Stack<Character> stk;
	static List<Character> expectedList;
	static List<Character> expectedList1;

	@BeforeClass
	public static void beforeTest() {
		

		expectedList = new Stack();
		expectedList.add('8');
		expectedList.add('4');
		expectedList.add('2');
		expectedList.add('1');
		
		expectedList1 = new Stack();
		expectedList1.add('8');
		expectedList1.add('4');
		expectedList1.add('2');
		expectedList1.add(null);
	

	}

	@Test
	public void reverseProgTest() {
		
		stk = new Stack<>();
		stk.push('1');
		stk.push('2');
		stk.push('4');
		stk.push('8');

		List<Character> l = MyStack.reverseProg(stk);

		assertNotNull(l);
		assertEquals(expectedList, l);

	}
	
	@Test
	public void reverseProgTest2() {
		
		
		stk = new Stack<>();
		stk.push(null);
		stk.push('2');
		stk.push('4');
		stk.push('8');

		List<Character> l = MyStack.reverseProg(stk);

		assertNotNull(l);
		assertEquals(expectedList1, l);

	}

}
