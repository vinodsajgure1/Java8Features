package com.example.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample2 {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(",", "[", "]");

		joiner.add("Vollyball");
		joiner.add("Chess");
		joiner.add("Archery");
		joiner.add("Cricket");

		System.out.println(joiner);

		int length = joiner.length();  // calculate the length of string using length method.

		System.out.println("The Length is : " + length);  
	}

}
