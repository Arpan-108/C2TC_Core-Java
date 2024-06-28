package com.tnsif.testcases.testing;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.tnsif.testcases.businesslogic.Operations;

public class TestClassTwo {
	
	@TestFactory
	public DynamicTest testMethod() {
		
		return DynamicTest.dynamicTest("First Dynamic Test", 
				()-> {Assertions.assertTrue(Operations.isPalindrome(121));});
	}
	
	public List<DynamicTest> testMethodTwo() {
		
		List<DynamicTest> tests=new ArrayList<DynamicTest>();
		return null;
	}
}
