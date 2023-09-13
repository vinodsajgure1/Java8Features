package com.example.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class SortMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("Four", 4);
		map.put("Ten", 10);
		map.put("Two", 2);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		// Traditional Way
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		System.out.println("**************************");

		// Anonymous implementation with lambda
		// Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		// java 8 stream way
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // comparing by key
																									// ascending

		System.out.println("**************************");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);// comparing by values
																									// ascending

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("**************************");


		Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2)->(int) (o2.getSalary()-o1.getSalary()));
		employeeMap.put((new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0)), 80);
		employeeMap.put((new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0)), 90);
		employeeMap.put((new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0)), 30);
		employeeMap.put((new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0)), 40);

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
		
		System.out.println("**************************");
		
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		.forEach(System.out::println);


	}
}
