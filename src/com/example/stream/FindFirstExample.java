package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);

		Optional<Integer> findFirst = list.stream().findFirst();

		if (findFirst.isPresent()) {
			Integer first = findFirst.get();
			System.out.println(first);
		} else {
			System.out.println("No Value");
		}

	}

}
