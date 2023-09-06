package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(12, 14, 3, 12, 3, 45, 90, 37, 26);

		List<Integer> unique = new ArrayList<>();

		nums.stream().distinct().forEach(unique::add);

		System.out.println(unique);
	}

}
