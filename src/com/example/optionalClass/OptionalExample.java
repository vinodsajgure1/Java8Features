package com.example.optionalClass;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		Optional<String> checkNull = Optional.ofNullable(null);

		if (checkNull.isPresent()) {
			System.out.println("Value is present");
		} else {
			System.out.println("String value is not present");
		}
		
		String orElse = checkNull.orElse("Default Message");
		System.out.println(orElse);
	}

}
