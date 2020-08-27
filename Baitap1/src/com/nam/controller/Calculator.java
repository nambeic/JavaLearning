package com.nam.controller;

public class Calculator {
	private float a;
	private float b;
	private String c;
	private float d;

	public void calculator() {
		switch (c) {
		case "+":
			d = a + b;
			System.out.println("a + b = " + d);
			break;
		case "-":
			d = a - b;
			System.out.println("a - b = " + d);
			break;
		case "*":
			d = a * b;
			System.out.println("a * b = " + d);
			break;
		case "/":
			d = a / b;
			System.out.println("a / b = " + d);
			break;
		default:
			System.out.println("Phep tinh khong dung");
			break;
		}
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

}
