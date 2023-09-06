package com.example.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaToConvertStringToUppercase {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("red", "green", "blue");

		System.out.println("Original String is :");
		for (String str : ls) {
			System.out.println(str);
		}

		ls.replaceAll(str -> str.toUpperCase());

		System.out.println("After case change : ");
		ls.forEach(n -> System.out.println(n));
	}

}
