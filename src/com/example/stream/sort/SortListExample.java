package com.example.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListExample {

	public static void main(String[] args) {

		List<Integer>  list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		// Traditional way 
		Collections.sort(list);// Ascending order
		Collections.reverse(list); // Descending order
		System.out.println(list);
		
		
		// java 8 way
		list.stream().sorted().forEach(n -> System.out.println(n));// Ascending order
		
		System.out.println("*************************");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n)); // Descending order
		
	}

}
