package com.example.lambdaExpression;

@FunctionalInterface
interface MyFunInteface {
	public int incrementByFive(int a);
}

public class LambdaWithSingleparameter {

	public static void main(String[] args) {

		MyFunInteface interf = (a) -> a + 5;
		
		System.out.println(interf.incrementByFive(38));
	}

}
