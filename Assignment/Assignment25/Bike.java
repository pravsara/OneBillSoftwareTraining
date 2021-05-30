package com.onebill.corejava.basics.Assignment25;

import java.util.Scanner;

public class Bike {

	public static void main(String[] args) {
		
		
		int[][] rider = new int[2][];
		boolean bool = true;
		
		Scanner sc = new Scanner(System.in);
		rider[0] = new int[1];
		rider[1] = new int[1];
		rider[0][0] = 0;
		rider[1][0] = 0;
		
		while (bool) {
			
			//rider or not
			System.out.println("Are you a Rider?\n1 for yes, 0 for no\nEnter Choice");
			int r = sc.nextInt();
			if (r == 0) {												
				System.out.println("Riders required");
			}
			else {														
				
				
				System.out.println("1-Weekday\n2-Weekend\nWhich day?");
				int day = sc.nextInt();
				
				System.out.println("How many kilometers driven?");
				int km = sc.nextInt();
				
			
				if(day == 1) {
				
					rider[day-1][0] += km;
				
				}
				
			
				else if(day == 2) {
				
					rider[day-1][0] += km;
					
				}

				System.out.println("Distance on weekdays : "+ rider[0][0]+"\nDistance on weekends : "+rider[1][0]);
					System.out.println();
				}
			
			
			System.out.println("\nPress 1 to Continue\nPress 0 to exit");
			int choice = sc.nextInt();
			if(choice==0) {
				bool=false;
			}
		}
		
		sc.close();
	}
}
