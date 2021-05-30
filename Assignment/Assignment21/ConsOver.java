package com.onebill.corejava.basics;

import java.util.Scanner;

class Volume{
	int vol;
	Volume() {
		vol=0;
	}
	Volume(int length) {		
		vol=length;
	}
	Volume(int length,int breadth) {
		vol=length*breadth;
	}
	Volume(int length,int breadth,int depth) {
		vol=length*breadth*depth;
	}
	public void display() {
		System.out.println(vol);
	}
}

public class ConsOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int length,breadth,depth;
		System.out.println("Enter 1. Length , 2. Breadth , 3. Depth");
		length=sc.nextInt();
		breadth=sc.nextInt();
		depth=sc.nextInt();
		Volume v1=new Volume();
		Volume v2=new Volume(length);
		Volume v3=new Volume(length,breadth);
		Volume v4=new Volume(length,breadth,depth);
		System.out.println("Object v1:");
		v1.display();
		System.out.println("Object v2:");
		v2.display();
		System.out.println("Object v3:");
		v3.display();
		System.out.println("Object v4:");
		v4.display();
		sc.close();
	}

}
