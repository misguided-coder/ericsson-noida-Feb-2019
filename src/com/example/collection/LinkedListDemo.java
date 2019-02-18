package com.example.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	LinkedList<Integer> numbers = new LinkedList<>();

	public static void main(String[] args) {
		new LinkedListDemo();
	}

	public LinkedListDemo() {
		 UC1();
		 UC2();
		 UC3();
		 UC4();
		 UC5();
		 UC6();
		 UC7();
	}

	// linked list can be used as a douly linked list also
	void UC7() {
		System.out.println(numbers);
		numbers.addFirst(5000);
		numbers.removeLast();
		System.out.println(numbers);
		
	}

	
	// linked list can be used as a queue also
	void UC6() {
		System.out.println(numbers);
		numbers.addLast(5000);
		numbers.removeFirst();
		System.out.println(numbers);
		
	}

	
	// retrieve each element using for each //Java 5
	void UC5() {
		for (int value : numbers) {
			System.out.printf("Value is : %s and Square is : %s %n", value, value * value);
		}
	}

	// retrieve each element using iterator
	void UC4() {
		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			int value = iterator.next();
			System.out.printf("Value is : %s%n", value);
		}

	}

	// retrieve each element using loop
	void UC3() {
		for (int idx = 0; idx < numbers.size(); idx++) {
			int value = numbers.get(idx);
			System.out.printf("Value is : %s%n", value);
		}
	}

	// reading numbers only
	void UC2() {
		int val = numbers.get(3);
		System.out.println(val);
		System.out.println(val / 40);
	}

				
	void UC1() {
		System.out.printf("List Size Before : %s !!! %n", numbers.size());

		numbers.add(200);
		numbers.add(60);
		numbers.add(500);
		numbers.add(300);
		numbers.add(900);

		System.out.printf("List Size After : %s !!! %n", numbers.size());
	}


}
