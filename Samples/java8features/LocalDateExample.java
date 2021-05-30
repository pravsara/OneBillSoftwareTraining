package com.onebill.corejava.basics.java8features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current Date is: "+ today);
		
		LocalDate someDate = LocalDate.of(2012, Month.AUGUST, 2);
		System.out.println("Some date value is: "+ someDate);
		
		LocalDate fromZone = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date from zone Asia/Kolkata - "+fromZone);
		
		LocalDate dateFromEpoch = LocalDate.ofEpochDay(365);
		System.out.println("Trying Epoch date..."+ dateFromEpoch);

	}

}
