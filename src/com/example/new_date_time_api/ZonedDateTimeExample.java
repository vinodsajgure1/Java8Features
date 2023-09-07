package com.example.new_date_time_api;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

		// get default time zone
		System.out.println(ZoneOffset.systemDefault());
		System.out.println(OffsetDateTime.now().getOffset());

		System.out.println("******************");

		// get current date time, with +5:30
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(dtf.format(zonedDateTime));
		System.out.println(zonedDateTime.getOffset());
		
		System.out.println("******************");


		// get get current date time, with +09:00
		ZonedDateTime japanDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
		System.out.println(dtf.format(japanDateTime)); 
		System.out.println(japanDateTime.getOffset());
	}

}
