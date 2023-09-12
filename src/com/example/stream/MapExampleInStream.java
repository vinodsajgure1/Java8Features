package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExampleInStream {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(39);
		marks.add(45);
		marks.add(23);
		marks.add(34);
		
		System.out.println("Marks Before Grace : "+ marks);

		// now if we want to add a grace marks of 6 to each object, we can use map.
		
		List<Integer> updatedMarks = marks.stream().map(i -> i + 6).collect(Collectors.toList());
		
		System.out.println("Marks after adding grace : "+updatedMarks);
	}

}
