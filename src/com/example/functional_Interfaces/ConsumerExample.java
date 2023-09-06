package com.example.functional_Interfaces;

import java.util.function.Consumer;

public class ConsumerExample {

	/*
	 * @FunctionalInterface 
	 * public interface consumer(T) {
	 *  void accept(T t);
	 *  
	 *  }
	 */
	public static void main(String[] args) {

		Consumer<String> print = x -> System.out.println(x);
		
		print.accept("Java");
	}

}
