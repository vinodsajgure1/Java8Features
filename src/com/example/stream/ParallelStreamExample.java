package com.example.stream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		long start=0;
		long end=0;
		
		start= System.currentTimeMillis();
		IntStream.range(1, 25).forEach(System.out::print);
		end=System.currentTimeMillis();
		
		System.out.println(" Plain stream time taken : "+(end-start));
		
		
		System.out.println("=============================================");
		
		start= System.currentTimeMillis();
		IntStream.range(1, 25).parallel().forEach(System.out::print);
		end=System.currentTimeMillis();
		
		System.out.println(" Parallel stream time taken : "+(end-start));
		
		
		
	}

}
