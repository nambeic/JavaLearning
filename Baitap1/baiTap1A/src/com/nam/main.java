package com.nam;

import com.nam.controller.Calculator;

public class main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.setA(5);
		cal.setB(10);
		cal.setC("/");

		cal.calculator();
	}

}
