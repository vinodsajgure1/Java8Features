package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 7, 8, 9, 2, 6);

		int sum = 0;
		for (int no : numbers) { // Traditional way
			sum = sum + no;
		}

		System.out.println(sum);

		// using stream

		int sum1 = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);

		// using reduce method

		Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(reduceSum);

		Integer sum3 = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum3);

		Integer multiply = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(multiply);

		// max value
		Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxValue);
		
		Integer max = numbers.stream().reduce(0, Integer:: max);
		System.out.println(max);
		
		Optional<Integer> minValue = numbers.stream().reduce(Integer::min);
		System.out.println(minValue.get());
		
		// create a List of strings to check longest string using reduce method.
		
		List<String> words = Arrays.asList("java","spring","spring boot","Hibernate");
		
		String longestString = words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(longestString);
		
		
		

	}

}
