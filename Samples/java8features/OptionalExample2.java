package com.onebill.corejava.basics.java8features;

import java.util.Optional;

public class OptionalExample2 {

	
		public Integer sum(Optional<Integer> a, Optional<Integer> b) {
			System.out.println("First param is: " +a.isPresent());
			System.out.println("Second param is: "+ b.isPresent());
			
			Integer firstValue = a.orElse(new Integer(0));
			Integer secondValue = b.get();
			return firstValue+secondValue;
		}
		
		
		public static void main(String[] args) {
			
			OptionalExample2 opexample = new OptionalExample2();
			Integer value1 = new Integer(20);
			Integer value2 = new Integer(30);
			
			Optional<Integer> val1 = Optional.ofNullable(value1);
			
			Optional<Integer> val2 = Optional.of(value2);
			
			System.out.println("Sum is: "+opexample.sum(val1, val2));

	}

}
