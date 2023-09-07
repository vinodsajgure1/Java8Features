package com.example.new_date_time_api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(dateFormat.format(date2));
	}

}
