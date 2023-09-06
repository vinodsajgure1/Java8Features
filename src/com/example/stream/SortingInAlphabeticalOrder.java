package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class SortingInAlphabeticalOrder {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("red", "green", "pink", "yellow", "black");

		System.out.println("The original list is : ");
		str.forEach(n -> System.out.println(n));

		str.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
		
		System.out.println("The list after sorting Alphabetically");
		str.forEach(n -> System.out.println(n));
		

	}

}
