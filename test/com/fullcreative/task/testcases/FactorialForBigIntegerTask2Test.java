package com.fullcreative.task.testcases;

import java.math.BigInteger;

import org.junit.*;
import org.junit.Assert.*;

import com.fullcreative.dayonetask.FactorialForBigIntegerTask2;

public class FactorialForBigIntegerTask2Test {

	@Test(expected = Exception.class)
	public void myFactTestNegativeValues() {
		// test negative no
		Assert.assertEquals(BigInteger.valueOf(24), FactorialForBigIntegerTask2.myFact(-4));
	}

	@Test
	public void myFactTestBigIntValues() {
		BigInteger l = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
		Assert.assertEquals(l, FactorialForBigIntegerTask2.myFact(50));

	}

}
