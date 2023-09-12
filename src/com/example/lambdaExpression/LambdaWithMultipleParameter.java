package com.example.lambdaExpression;

public class LambdaWithMultipleParameter {

	@FunctionalInterface
	interface Myfunctional {
		public String concat(String a, String b);
	}

	public static void main(String[] args) {
		
		Myfunctional fun = (a , b) -> a + b;
		
		System.out.println(fun.concat("Welcome", "Jav8"));

	}

}
