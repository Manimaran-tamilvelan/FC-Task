package com.fullcreative.task.testcases;

import java.math.BigInteger;

import javax.naming.LimitExceededException;

import org.junit.*;
import org.junit.Assert;

import com.fullcreative.dayonetask.FactorialTask1;

public class FactorialTask1Test {

	@Test
	public void FactFuncTest() {
		BigInteger l = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
		Assert.assertEquals(l, FactorialTask1.fact(50));
	}

	@Test(expected = Exception.class)
	public void FactFuncIndefinite() {

		Assert.assertEquals(120, FactorialTask1.fact(-5));
	}

}
