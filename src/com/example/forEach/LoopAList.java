package com.example.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoopAList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add(null);
	      list.add("D");
	      list.add("E");

	      // filter null value
	      list.stream()
	              .filter(Objects::nonNull)
	              .forEach(System.out::println);

	}

}
