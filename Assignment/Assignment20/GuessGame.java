package com.onebill.corejava.basics;
import java.util.*;
public class GuessGame {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc = new Scanner(System.in);
			char inp,guess=(char)(97+rand.nextInt(26));
			System.out.println("Enter your guess(a-z):\t");
			do {
				System.out.println("Enter 0 to exit..");
				inp = sc.next().charAt(0);
				if(inp>='a'&&inp<='z') {
					if(inp==guess) { 
						System.out.println("You have guessed the correct character");
						break;
					}
					else {
						System.out.println("Try again");
					}
				}
				else {
					if(inp!='0')
						System.out.println("Enter Valid Input");
					System.out.println("The value is:"+guess);
				}
			} while(inp!='0');
		
		System.out.println("End"); 
		sc.close();
	}
}
