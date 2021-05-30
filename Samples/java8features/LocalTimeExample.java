package com.onebill.corejava.basics.java8features;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current time: "+time);
		
		LocalTime specificTime = LocalTime.of(12, 25, 55, 30);
		System.out.println("Specific Time of the day: "+specificTime);
		
		LocalTime zoneBasedTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zoneBasedTime);

	}

}
