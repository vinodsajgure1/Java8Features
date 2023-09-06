package com.example.functional_Interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierExample {

	/*
	 * @FunctionalInterface 
	 * public interface Supplier(T) {
	 *		T get();
	 * }
	 */
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		
		// Example 1
		
		Supplier<LocalDateTime> s = () -> LocalDateTime.now();

		LocalDateTime dateTime = s.get();
		
		System.out.println(dateTime);
		
		// Example 2
		
		Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
		String time2 = s1.get();
		
		System.out.println(time2);
		
	}

}
