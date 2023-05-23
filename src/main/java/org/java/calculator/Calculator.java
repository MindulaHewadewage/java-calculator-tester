package org.java.calculator;

public class Calculator {

	private float x;
	private float y;
	
	public  Calculator(float x,float y) {
		setX(x);
		setY(y);
	}
	
	
	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	public float add() {
		return getX()+getY();
		
	}
	
	public float substract() {
		return getX()-getY();
		
	}
	public float divide() {
		return getX()/getY();
		
	}
	public float multiply() {
		return getX()*getY();
		
	}
}
