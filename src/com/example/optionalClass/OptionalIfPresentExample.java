package com.example.optionalClass;

import java.util.Optional;

public class OptionalIfPresentExample {

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
		Optional<Object> empty = Optional.empty();

		if (gender.isPresent()) {
			System.out.println("Value is available");
		} else {
			System.out.println("Value is not available");

		}
		
		gender.ifPresent(g -> System.out.println("In gender option value is available"));
		
		empty.ifPresent(g -> System.out.println("Value availabe in empty"));
	}

}
