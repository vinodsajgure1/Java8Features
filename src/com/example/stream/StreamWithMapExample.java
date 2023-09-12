package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMapExample {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(12, 3, 8, 9, 4, 5, 7);

		List<Integer> result = num.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(result);
	}

}
