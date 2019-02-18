package com.example.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	Map<Car, Long> carSalesMap = new TreeMap<>();

	public static void main(String[] args) {
		new TreeMapDemo();
	}

	public TreeMapDemo() {
		UC1();
	}

	void UC1() {
		System.out.printf("Map Before : %s !!! %n", carSalesMap);
		carSalesMap.put(new Car(200,"X6","BMW",500,90000000.00,"Yellow"), 440L);
		carSalesMap.put(new Car(500,"Q5","Audi",100,4000000.00,"Yellow"), 140L);
		carSalesMap.put(new Car(300,"X2","BMW",230,1280000.00,"Red"), 200L);
		carSalesMap.put(new Car(100,"X1","BMW",300,8000000.00,"Yellow"), 240L);
		carSalesMap.put(new Car(400,"Q7","Audi",700,5000000.00,"Black"), 290L);
		System.out.printf("Map After : %s !!! %n", carSalesMap);
	}

}
