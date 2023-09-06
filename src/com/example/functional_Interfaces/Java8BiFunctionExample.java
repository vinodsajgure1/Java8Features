package com.example.functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Java8BiFunctionExample {

	/*
	 * @FunctionalInterface public interface BiFunction<T, U, R> {
	 * 
	 * R apply(T t, U u);
	 * 
	 * }
	 */
	public static void main(String[] args) {

		// takes two Integers and return an Integer

		BiFunction<Integer, Integer, Integer> fun = (x1, x2) -> x1 * x2;

		Integer result = fun.apply(12, 9);

		System.out.println(result);

		// take two Integers and return a List<Integer>

		BiFunction<Integer, Integer, List<Integer>> function2 = (x1, x2) -> Arrays.asList(x1 + x2);

		List<Integer> result2 = function2.apply(7, 8);

		System.out.println(result2);

	}

}
