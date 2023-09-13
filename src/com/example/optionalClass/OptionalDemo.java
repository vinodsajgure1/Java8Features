package com.example.optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	// creating method to call customer by email id.

	public static Customer getCustomerByEmailId(String email) throws Exception {
		List<Customer> customer = CustomerList.getAll();
		return customer.stream().filter(cust -> cust.getEmail().equals(email)).findAny()
				.orElseThrow(()-> new Exception("No customer is present with this email id"));
	}

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer(102, "John", "john@gail.com", Arrays.asList("12345", "789944"));

		// empty
		// of
		// ofNullable

		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		System.out.println("*************************");

		// Optional<String> emailOptional = Optional.of(customer.getEmail());
		// System.out.println(emailOptional);

		System.out.println("*************************");

		Optional<String> email = Optional.ofNullable(customer.getEmail());
		if (email.isPresent()) {
			System.out.println(email.get());
		}

		System.out.println(email.orElse("default@email.com"));

		// System.out.println(email.orElseThrow(()->new IllegalArgumentException("Email
		// not present")));

		System.out.println(email.map(String::toUpperCase).orElseGet(() -> "Default email..."));

		// calling the getCustomerByEmailId Method

		getCustomerByEmailId("pqr");

	}

}
