package com.tnsif.testcases.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.tnsif.testcases.businesslogic.Operations;

public class MyTestClass {

	@Test
	public void testAddition() {
		
		int expected = 7;
		int actual = Operations.add(2, 5);
		
		Assertions.assertEquals(expected, actual);
		
	}
}
