package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		//Arrange & Act
		MyClass tester = new MyClass();
		tester.multiply(1700, 5);
	}

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		//Assert
		assertEquals("20 x 5 must be 100", 100, tester.multiply(20, 5));
		assertEquals("30 x 5 must be 150", 150, tester.multiply(30, 5));
		assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
		
	}
}