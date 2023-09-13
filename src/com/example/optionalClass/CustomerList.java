package com.example.optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerList {

	public static List<Customer> getAll(){
	
		return Stream.of(
				new Customer(101,"John","john@gmail.com",Arrays.asList("12345","9879865")),
				new Customer(101,"smith","smith@gmail.com",Arrays.asList("123453","398765")),
				new Customer(101,"peter","peter@gmail.com",Arrays.asList("4512345","9558765")),
				new Customer(101,"keley","keley@gmail.com",Arrays.asList("70012345","6998765"))
				).collect(Collectors.toList());
	}

}
