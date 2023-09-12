package com.example.stream.sort;

import java.util.Arrays;

public class ParallelSortExample {

	public static void main(String[] args) {

		int[] arr = { 58, 8, 7, 19, 39, 30, 4 };

		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("*****************");
		// Sorting array elements parallel and passing start and end index.

		Arrays.parallelSort(arr, 2, 7);

		for (int i : arr) {
			System.out.println(i + " ");
		}
	}

}
