package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AddingTwoStreams {

	public static void main(String[] args) {

		List<String> alphabets = Arrays.asList("A", "C", "V", "R");

		List<String> names = Arrays.asList("Apple", "Car", "Voilet", "Red");

		// creating two streams and concatenating them in to one.

		Stream<String> concat = Stream.concat(alphabets.stream(), names.stream());

		concat.forEach(n -> System.out.print(n +" "));
	}

}
