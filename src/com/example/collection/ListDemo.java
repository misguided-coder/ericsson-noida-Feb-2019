package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	List list = new ArrayList();
	// List<Integer> numbers = new ArrayList<Integer>(); //List with Generics
	List<Integer> numbers = new ArrayList<>();

	public static void main(String[] args) {
		new ListDemo();
	}

	public ListDemo() {
		// UC1();
		// UC2();
		// UC3();
		// UC4();
		// UC5();
		// UC6();
		UC7();
		// UC8();
		// UC9();
		// UC10();
		UC11();

	}

	// retrieve each element using for each //Java 5
	void UC11() {
		for(int value : numbers) {
			System.out.printf("Value is : %s and Square is : %s %n", value,value*value);
		}
	}

	// retrieve each element using iterator
	void UC10() {
		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			int value = iterator.next();
			System.out.printf("Value is : %s%n", value);
		}

	}

	// retrieve each element using loop
	void UC9() {
		for (int idx = 0; idx < numbers.size(); idx++) {
			int value = numbers.get(idx);
			System.out.printf("Value is : %s%n", value);
		}
	}

	// reading numbers only
	void UC8() {
		int val = numbers.get(3);
		System.out.println(val);
		System.out.println(val / 40);
	}

	// adding numbers only
	void UC7() {
		numbers.add(500);
		numbers.add(new Integer(200));
		numbers.add(600);
		numbers.add(400);
		numbers.add(700);
	}

	// reading elements and doing computations
	void UC6() {
		Object obj = list.get(0);
		System.out.println(obj);

		// Integer it = (Integer) obj;
		int it = (Integer) obj;

		// int rs = it.intValue() + 2;
		int rs = it + 2;

		System.out.printf("Result : %s%n", rs);
	}

	// deleting elements
	void UC5() {
		System.out.printf("List Before : %s !!! %n", list);
		list.remove(3);
		System.out.printf("List After : %s !!! %n", list);
	}

	// updating elements
	void UC4() {
		System.out.printf("List Before : %s !!! %n", list);
		list.set(2, "Mohan");
		System.out.printf("List After : %s !!! %n", list);
	}

	// reading elements
	void UC3() {
		Object obj = list.get(0);
		System.out.println(obj);
		obj = list.get(4);
		System.out.println(obj);
	}

	// adding elements using primitives (auto boxing)
	// Java 5
	void UC2() {
		System.out.printf("List Size Before : %s !!! %n", list.size());

		list.add(new Integer(100));
		list.add(100);
		list.add(100.000);
		list.add(45700.000F);
		list.add(true);
		list.add(new String("Hola"));

		System.out.printf("List Size After : %s !!! %n", list.size());
	}

	// adding elements
	void UC1() {
		System.out.printf("List Size Before : %s !!! %n", list.size());

		int i = 1000;
		Integer it = new Integer(i);
		list.add(it);

		double d = 90.00;
		Double dbl = new Double(d);
		list.add(dbl);

		String str = new String("Ritesh");
		list.add(str);

		list.add(new Double(1200.00));

		list.add(new Float(150.00F));
		System.out.printf("List Size After : %s !!! %n", list.size());
	}
}
