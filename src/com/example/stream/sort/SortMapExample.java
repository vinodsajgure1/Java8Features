package com.example.stream.sort;

import java.util.HashMap;
import java.util.Map;

public class SortMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		// java 8 stream to sort a map
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // comparing by key

		System.out.println("*****************");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);// comparing by values
	}

}
