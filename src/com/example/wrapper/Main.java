package com.example.wrapper;

public class Main {

	public static void main(String[] args) {
		
		int i = 10;
		Integer it = new Integer(i); //explicit boxing/wrapping
		System.out.println(i);
		System.out.println(it);
		
		int x = it.intValue(); //explicit unboxing/unwrapping
		System.out.println(x);
					
		Integer it1 = new Integer(100);
		System.out.println(it1);
		
		double d =1000.00;
		Double dbl = new Double(d);
		System.out.println(d);
		System.out.println(dbl);
		System.out.println(dbl.doubleValue());
		
	}
}
