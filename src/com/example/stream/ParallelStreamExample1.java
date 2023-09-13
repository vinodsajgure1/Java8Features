package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("L", "k", "S", "R", "V");

		list.parallelStream().forEach(System.out::print);
		// Parallel Stream example , In the output it will not maintain  the order of list elements.
		
		// If we want orderd list then we can use forEachOrdered method
		
		list.parallelStream().forEachOrdered(System.out::print);
	}

}
