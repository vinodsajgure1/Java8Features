package com.example.stream;

import java.util.stream.Stream;

public class StreamIterateExample {

	public static void main(String[] args) {

		Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);
		
		System.out.println("======================================");
		
		Stream.iterate(0, n->n+1).filter(x -> x%2!=0).limit(20).forEach(System.out::println);
		
	}

}
