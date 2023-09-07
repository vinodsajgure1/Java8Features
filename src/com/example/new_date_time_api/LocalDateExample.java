package com.example.new_date_time_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");

		LocalDate localDate = LocalDate.now();

		System.out.println(dtf.format(localDate));
	}

}
