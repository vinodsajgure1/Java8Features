package com.example.new_date_time_api;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime localTime = LocalTime.now();
		
		System.out.println(dtf.format(localTime));
		
		System.out.println("**********************");
		// Local date and time format
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(df.format(localDateTime));
	}
	

}
