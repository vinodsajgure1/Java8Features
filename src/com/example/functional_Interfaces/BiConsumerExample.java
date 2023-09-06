package com.example.functional_Interfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	/*
	 * @FunctionalInterface 
	 * public interface BiConsumer(T , U) {
	 *  void accept(T t, U u); 
	 * }
	 */
	
	public static void main(String[] args) {

	      BiConsumer<Integer,Integer> addTwo = (x, y) -> System.out.println(x + y);
	      
	      addTwo.accept(12, 27);
		
	}

}
