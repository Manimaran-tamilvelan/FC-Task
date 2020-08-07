package com.fullcreative.task.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.fullcreative.dayonetask.MethodOverloadingTask3;

public class MethodOverloadingTask3Test {
//implementation of this + OOPS - Exception Handling+junit

	@Test
	public void addFor2IntArgs() {

		Assert.assertEquals(0, MethodOverloadingTask3.add(-5, 5));

	}
	
	@Test
	public void addFor2DoubleArgs() {
		// expected - actual <= delta
				Assert.assertEquals(10.0, MethodOverloadingTask3.add(10.0, 0), 0);
				
	}
	
	@Test
	public void addFor3IntArgs() {
		Assert.assertEquals(15, MethodOverloadingTask3.add(5, 5, 5));
	}
	
}
