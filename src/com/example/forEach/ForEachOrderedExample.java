package com.example.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedExample {

	public static void main(String[] args) {

		List<String> gameList = new ArrayList<>();
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Basketball");
		gameList.add("Kabaddi");
		gameList.add("Hockey");

		
		gameList.stream().forEachOrdered(games -> System.out.println(games));  // using forEachOrdered method of stream.
		
		System.out.println("***********************");
		
		gameList.stream().forEachOrdered(System.out::println);  // using the double colon operator.



	}

}
