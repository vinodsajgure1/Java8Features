package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class AverageOfListOfDoubles {

	public static void main(String[] args) {

		List<Double> num = Arrays.asList(5.5, 3.5, 6.8, 9.5);

		double average = num.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		
		System.out.println(average);
	}

}
