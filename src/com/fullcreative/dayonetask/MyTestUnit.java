package com.fullcreative.dayonetask;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class MyTestUnit {

	@Test
	public void factMethodTestForTaskOne() {
		assertEquals(24, FactorialTask1.fact(4));

	}

	@Test
	public void factTestForBigInt() {

		assertEquals(BigInteger.valueOf(24), FactorialForBigIntegerTask2.myfact(4));
	}

	@Test
	public void methodOverloadingTest() {
		assertEquals(10, MethodOverloadingTask3.add(5, 5));
		assertEquals(110.0, MethodOverloadingTask3.add(10.0, 100), 0);
		assertEquals(15, MethodOverloadingTask3.add(5, 5, 5));

	}

}
