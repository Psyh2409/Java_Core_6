package com.gmail.psyh2409.calculator.com.lgs.lab.interface2;

import com.gmail.psyh2409.calculator.com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	@Override
	public double plus(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double minus(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double devide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.plus(5, 7));
		System.out.println(mc.minus(5, 7));
		System.out.println(mc.multiply(5, 7));
		System.out.println(mc.devide(5, 7));
	}
	/*Output:
12.0
-2.0
35.0
0.7142857142857143
	 * */
}
