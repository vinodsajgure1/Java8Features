package com.example.functional_Interfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	/*
	 * @FunctionalInterface 
	 * public interface BiPredicate<T , U>{
	 *  boolean test(T t, U u);
	 * }
	 */
	public static void main(String[] args) {
		
		BiPredicate<String,Integer> filter = (x , y ) -> {
			return x.length()==y;
		};
		
		
		boolean test = filter.test("Welcome", 7);
		
		System.out.println(test);

		
	}

}
