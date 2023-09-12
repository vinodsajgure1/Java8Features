package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaWithFilterExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 23, 45, 24, 12, 90);

		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		
		System.out.println("Even Numbers Are :");
		evenNumbers.forEach(n -> System.out.println(n));

		List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

		System.out.println("Odd Numbers Are : ");
		oddNumbers.forEach(n -> System.out.println(n));
	}
	
	// Intermediate Operations :  filter , map , sorted.
	// Terminal Operations : forEach , collect , match , count ,reduce.

}
