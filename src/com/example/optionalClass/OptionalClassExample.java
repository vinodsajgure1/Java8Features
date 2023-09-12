package com.example.optionalClass;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {

		String[] str = new String[10];
		str[0] = "Java8features";
		str[1] = null;

		Optional<String> isNull = Optional.ofNullable(str[1]);

		if (isNull.isPresent()) {
			String substring = str[1].substring(2, 5);
			System.out.println("Substring : " + substring);
		} else {
			System.out.println("Can not get the subString from empty string");
		}
		
		
		Optional<String> isNull2 = Optional.ofNullable(str[0]);
		
		if(isNull2.isPresent()) {
			String sub = str[0].substring(2,6);
			System.out.println("Substring is : "+ sub);
		}
		else {
			System.out.println("Can not get substring from empty substring");
		}
	}

}
