package com.example.stringJoiner;

import java.util.StringJoiner;

public class StingJoinerExample {

	public static void main(String[] args) {

		StringJoiner joinNames = new StringJoiner(",");
		joinNames.add("Apple");
		joinNames.add("Banana");
		joinNames.add("Cherry");
		joinNames.add("Pineapple");
		
		System.out.println(joinNames);

	}

}
