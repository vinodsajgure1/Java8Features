package com.example.lambda;

public class LambdaExpressionWithTwoParameters {

	interface Addable {
		int add(int a, int b);

	}

	public static void main(String[] args) {

		Addable ad = (a, b) -> (a + b);

		System.out.println(ad.add(12, 98));
	}

}
