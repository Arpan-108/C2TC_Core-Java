package com.tnsif.testcases.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.tnsif.testcases.businesslogic.Operations;

public class MyTestClass {

	@Test
	public void testAddition() {
		
		System.out.println("Addition Testing");
		int expected = 7;
		int actual = Operations.add(2, 5);
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testFactorial() {
		
		System.out.println("Factorial Testing");
		long expected = 5040;
		long actual = Operations.getFactorial(7);
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialForZero() {
		
		System.out.println("Zero Factorial Testing");
		long expected = 1;
		long actual = Operations.getFactorial(0);
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialForNegativeNumbers() {
		
		System.out.println("Negative Number Factorial Testing");
		long expected = -1;
		long actual = Operations.getFactorial(-2);
		
		Assertions.assertEquals(expected, actual);
	}
}
