package com.example.lambdaExpression;

@FunctionalInterface
interface MyInterface {

	// abstract method
	double getPiValue();
}

public class LambdaExpression {

	public static void main(String[] args) {

		MyInterface ref = () -> 3.1415;

		System.out.println("The Value of Pi is = " + ref.getPiValue());
	}

}
