package com.example.box;

//Java 5
public class BoxDemo {

	public static void main(String[] args) {

		int i = 100;
		Integer it1 = new Integer(i); //explicit boxing
		Integer it2 = i; //auto boxing
	
		int x = it1.intValue(); //explicit unboxing
		int y = it1; //auto unboxing
		
		Integer a = new Integer(1000);
		Integer b = new Integer(1000);
		
		int rs1 = a.intValue() + b.intValue(); //Before Java 5
		int rs2 = a + b; //Java 5
		
		System.out.println(rs1);
		System.out.println(rs2);
		
		
	}

}
