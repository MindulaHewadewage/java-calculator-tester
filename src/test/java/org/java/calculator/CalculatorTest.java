package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
	
	private Calculator c;
	
@BeforeEach
public void initCalculator() {
	final Random rnd =new Random();
	final float x=rnd.nextFloat(0,100);
	final float y=rnd.nextFloat(0,100);
	
	c=new Calculator(x,y);
}

@RepeatedTest(10)
public void addTest() {
	final float res=c.add();
	final float attRes=c.getX()+c.getY();
	assertEquals(attRes, res);
}

@RepeatedTest(10)
public void substractTest() {
	final float res=c.substract();
	final float attRes=c.getX()-c.getY();
	assertEquals(attRes, res);
}

@RepeatedTest(10)
public void divideTest() throws Exception {
	final float res=c.divide();
	final float attRes=c.getX()/c.getY();
	assertEquals(attRes, res);
}

@RepeatedTest(10)
public void multiplyTest() {
	final float res=c.multiply();
	final float attRes=c.getX()*c.getY();
	assertEquals(attRes, res);
}
}
