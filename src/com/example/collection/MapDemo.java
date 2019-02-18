package com.example.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	//Map<String, Long> cityPopulationMap = new HashMap<>();
	Map<String, Long> cityPopulationMap = new TreeMap<>();

	public static void main(String[] args) {
		new MapDemo();
	}

	public MapDemo() {
		UC1();
		// UC2();
		// UC3();
		// UC4();
		// UC5();
		// UC6();
		 //UC7();
			
	}

	void UC7() {
		Set<Entry<String, Long>> entries = cityPopulationMap.entrySet();
		Iterator<Entry<String, Long>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Entry<String, Long> entry = iterator.next();
			System.out.printf("Entry is : %s%n", entry);
			System.out.printf("Entry Key is : %s%n", entry.getKey());
			System.out.printf("Entry Value : %s%n", entry.getValue());
		}
	}

	
	void UC6() {
		Collection<Long> values = cityPopulationMap.values();
		Iterator<Long> iterator = values.iterator();

		while (iterator.hasNext()) {
			long value = iterator.next();
			System.out.printf("Value is : %s%n", value);
		}

	}

	void UC5() {
		Set<String> cities = cityPopulationMap.keySet();
		Iterator<String> iterator = cities.iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.printf("Key is : %s%n", key);
		}

	}

	void UC4() {
		System.out.printf("Map Before : %s !!! %n", cityPopulationMap);
		cityPopulationMap.put("Mumbai", 100000000L);
		System.out.printf("Map After : %s !!! %n", cityPopulationMap);
	}

	void UC3() {
		System.out.printf("Map Before : %s !!! %n", cityPopulationMap);
		cityPopulationMap.remove("Mumbai");
		System.out.printf("Map After : %s !!! %n", cityPopulationMap);
	}

	void UC2() {
		System.out.println(cityPopulationMap.get("Delhi1111"));
		long value = cityPopulationMap.get("Delhi");
		System.out.printf("Value is : %s !!! %n", value);
	}

	void UC1() {
		System.out.printf("Map Before : %s !!! %n", cityPopulationMap);
		cityPopulationMap.put("Delhi", 2100000L);
		cityPopulationMap.put("Pune", 100000L);
		cityPopulationMap.put("Mumbai", 9992100000L);
		cityPopulationMap.put("Chennai", 82100000L);
		cityPopulationMap.put("Calcutta", 3400000L);
		cityPopulationMap.put("Hyderabad", 9000000L);
		cityPopulationMap.put("RAMA", 1000000L);
		cityPopulationMap.put("MARA", 2000000L);
		System.out.printf("Map After : %s !!! %n", cityPopulationMap);
	}

}
