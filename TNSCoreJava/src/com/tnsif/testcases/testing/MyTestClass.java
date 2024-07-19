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
	
	@Test
	public void testForPrime() {
		
		System.out.println("Prime testing");
		
		Assertions.assertTrue(Operations.isPrime(5));
	}
	
	@Test
	public void testForNonPrime() {
		
		System.out.println("Non Prime testing");
		
		Assertions.assertFalse(Operations.isPrime(4));
	}
	
	@Test
	public void testForNumberPalindrome() {
		
		System.out.println("Number Palindrome testing");
		
		Assertions.assertTrue(Operations.isPalindrome(151));
	}
	
	@Test
	public void testForNumberNonPalindrome() {
		
		System.out.println("Number Not Palindrome testing");
		
		Assertions.assertFalse(Operations.isPalindrome(15));
	}
	
	@Test
	public void testForStringPalindrome() {
		
		System.out.println("String Palindrome testing");
		
		Assertions.assertTrue(Operations.isPalindrome("RACECAR"));
	}
	
	@Test
	public void testForStringNonPalindrome() {
		
		System.out.println("String Not Palindrome testing");
		
		Assertions.assertFalse(Operations.isPalindrome("CAR"));
	}
}
