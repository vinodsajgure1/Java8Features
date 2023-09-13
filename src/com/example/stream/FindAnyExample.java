package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Optional<Integer> findAny = list.stream().findAny();

		if (findAny.isPresent()) {
			Integer anyNum = findAny.get();
			System.out.println(anyNum);
		}
	}

}
