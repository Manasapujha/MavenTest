package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassTest {

	@Test
	public void test() {
		TestClass testClass = new TestClass();
		
		assertTrue(testClass.Sample().equals("testString"));
	}

}
