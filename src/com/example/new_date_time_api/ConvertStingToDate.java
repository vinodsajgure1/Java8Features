package com.example.new_date_time_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStingToDate {

	public static void main(String[] args) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "7-Jun-2023";
		
		try {
			Date date = dateFormat.parse(dateInString);
			System.out.println(date);
			System.out.println(dateFormat.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
