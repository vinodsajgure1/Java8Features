package com.example.functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	/*
	 * @FunctionalInterface 
	 * public interface Predicate<T> {
	 * boolean test(T t);
	 *  
	 * }
	 */
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11,23,5,3,8,2,34,98,56);
		
		List<Integer> collect = list.stream().filter(x -> x < 11).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		// with multiple filters &&
		
		List<Integer> list1 = Arrays.asList(12,34,45,23,2,9,6);
		
		List<Integer> collect2 = list1.stream().filter(x -> x>9 && x<34).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		
		// predicate with negate
		
		Predicate<String> startsWithA =  x -> x.startsWith("A");
		
		List<String> list2 = Arrays.asList("A","AA","AAA","B","BB","BBB");
		List<String> collect3 = list2.stream().filter(startsWithA.negate()).collect(Collectors.toList());
		
		System.out.println(collect3);
		
	}
	

}
