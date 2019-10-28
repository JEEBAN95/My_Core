package com.jk.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	public static void main(String[] args) {

		/*long ms = System.currentTimeMillis();
		System.out.println(ms);
		java.util.Date d = new java.util.Date(ms);
		java.sql.Date sqDate = new java.sql.Date(d.getTime());
		System.out.println(d);
		System.out.println(sqDate);
		
		long ms2 = sqDate.getTime();
		System.out.println(ms2);*/
		
		
		String dateOfBourn="24-04-1995";
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		try {
			java.util.Date dob  = format.parse(dateOfBourn);
			System.out.println("Date of Burn ::"+dob);
			//System date
			long currentTime = System.currentTimeMillis();
			//convert system date to java.util.Date
			java.util.Date currDate = new Date(currentTime);
			System.out.println("Current Date :: "+currDate);
			System.out.print(currDate.getYear()-dob.getYear()+" :Years ");
			System.out.println(currDate.getMonth()-dob.getMonth()+" :Months");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
