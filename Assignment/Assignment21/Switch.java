package com.onebill.corejava.basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inp;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1.Conditional Statement\n2.Iteration Statement\n3.Jumping Statement\nEnter your choice:(0-exit)");
		inp=sc.nextInt();
		switch(inp) {
		case 1: System.out.println("1.if\n2.if...else\n3.else...if\n4.else...if ladder\n5.nested if\n6.switch\nEnter your choice:");
			inp=sc.nextInt();
			switch(inp) {
			case 1: System.out.println("if(condition){\n}");
				break;
			case 2: System.out.println("if(condition){\n} else{\n}");
				break;
			case 3: System.out.println("if(condition){\n} else if(condition){\n}");
				break;
			case 4: System.out.println("if(condition){\n} else if(condition){\n}else{\n}");
				break;
			case 5: System.out.println("if(condition){\nif(condition){\n}\n}");
				break;
			case 6: System.out.println("switch(inp)\ncase inp:\nbreak\ndefault:");
				break;
			default: System.out.println("Invalid input");
			}
			break;
			case 2: System.out.println("1.while\n2.do while\n3.for loop\nEnter your choice:");
			inp=sc.nextInt();
			switch(inp) {
			case 1:
				System.out.println("while(condition) {\n}");
				break;
			case 2:
				System.out.println("do{\n}while(condition);");
				break;
			case 3:
				System.out.println("for(initialisation,condition,inc/dec) {\n}");
				break;
			default:
				System.out.println("Invalid input");
			}
			break;
			case 3:
				System.out.println("1.break\n2.continue\n3.return");
				inp=sc.nextInt();
				switch(inp) {
				case 1:
					System.out.println("break;");
					break;
				case 2:
					System.out.println("continue;");
					break;
				case 3:
					System.out.println("return value;");
					break;
				default:
					System.out.println("Invalid input");
				}
				default:
					if(inp!=0)
						System.out.println("Invalid input");
		}
		}while(inp!=0);
		sc.close();
	}

}
