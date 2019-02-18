package com.example.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceDemo {

	public static void main(String[] args) {
		new PerformanceDemo();
	}

	public PerformanceDemo() {
		UC1();
		UC2();
	}

	void UC2() {
		List<Integer> numbers = new ArrayList<>();
		for(int idx=0;idx<50000;idx++) {
			numbers.add((int)(Math.random()*5000));
		}
		
		long startTime = System.nanoTime();
		for(int idx=20000;idx<30000;idx++) {
			numbers.remove(idx);
		}
		long endTime = System.nanoTime();
		System.out.printf("Total Time : %s ms %n",(endTime-startTime)/1000);	
	}

	void UC1() {
		List<Integer> numbers = new LinkedList<>();
		for(int idx=0;idx<50000;idx++) {
			numbers.add((int)(Math.random()*5000));
		}

		long startTime = System.nanoTime();
		for(int idx=20000;idx<30000;idx++) {
			numbers.remove(idx);
		}
		long endTime = System.nanoTime();
		System.out.printf("Total Time : %s ms %n",(endTime-startTime)/1000);	
	}

}
