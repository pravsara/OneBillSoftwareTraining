package com.onebill.corejava.basics.Assignment25;

public class Equal {
	   public static void main(String[] args)
	   {
	        String s1 = new String("HELLO");
	        String s2 = new String("HELLO");
	        System.out.println(s1 == s2);// checks address
	        System.out.println(s1.equals(s2));// checks values
	    }
	}
	
