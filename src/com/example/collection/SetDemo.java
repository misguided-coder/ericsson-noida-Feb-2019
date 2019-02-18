package com.example.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	//Set<Integer> numbers = new HashSet<>();
	Set<Integer> numbers = new TreeSet<>();

	public static void main(String[] args) {
		new SetDemo();
	}

	public SetDemo() {
		UC1();
		UC2();
		UC3();
		UC4();
	}

	void UC4() {
		System.out.printf("Set Before : %s !!! %n", numbers);
		numbers.remove(10);
		numbers.remove(12);
		System.out.printf("Set After : %s !!! %n", numbers);
	}

	
	void UC3() {
		for (int value : numbers) {
			System.out.printf("Value is : %s and Square is : %s %n", value, value * value);
		}
	}

	void UC2() {

		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			int value = iterator.next();
			System.out.printf("Value is : %s%n", value);
		}
	}

	void UC1() {
		System.out.printf("Set Before : %s !!! %n", numbers);
		numbers.add(500);
		numbers.add(200);
		numbers.add(100);
		numbers.add(50);
		numbers.add(60);
		numbers.add(40);
		numbers.add(10);
		numbers.add(12);
		numbers.add(120);
		numbers.add(410);
		numbers.add(120);
		System.out.printf("Set After : %s !!! %n", numbers);
	}

}
