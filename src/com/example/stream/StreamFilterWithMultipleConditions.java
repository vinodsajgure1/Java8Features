package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterWithMultipleConditions {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("interface", "Methods", "classes", "functions", "programmme");

		List<String> result = names.stream().filter(str -> str.length() > 6 && str.length() < 8)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
