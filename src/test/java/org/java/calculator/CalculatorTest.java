package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
@Test
public void addTest() {
	final float x=10;
	final float y=10;
	
	final float attRes=20;
	
	final Calculator c = new Calculator(x, y);
	final float res = c.add();
	
	assertEquals(attRes, res);
}
}
