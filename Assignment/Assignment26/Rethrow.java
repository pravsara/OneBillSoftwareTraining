package com.onebill.corejava.basics.Assignment26;

public class Rethrow {
	   public static void test() throws Throwable {
	      try {
	         System.out.println("First");
	         throw new Exception("Exception");
	         
	      } catch(Exception e) {
	         System.out.println("Inside method");
	         throw e;
	      }
	   }
	   public static void main(String[] args) throws Throwable {
	      try {
	         test();
	      } catch(Exception e) {
	         System.out.println("Caught");
	      }
	   }
	}