package com.example.functional_Interfaces;

import java.util.function.Function;

public class Java8FunctionExample {

	/*
	 * @FunctionalInterface public interface Function<T, R> {
	 * 
	 * R apply(T t);
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Function<String, Integer> fun = x -> x.length();

		Integer apply = fun.apply("Welcome");

		System.out.println(apply);
	}

}
