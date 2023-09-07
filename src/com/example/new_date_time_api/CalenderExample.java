package com.example.new_date_time_api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {

		DateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar instance = Calendar.getInstance();
		
		System.out.println(dtf.format(instance.getTime()));
	}

}
