package com.onebill.corejava.basics;

class Box {
	public void display(char c,int num) {
		System.out.println("First version");
	}
	public void display(int num,char c) {
		System.out.println("Second version");
	}
	public void display(int num) {
		System.out.println("Third version");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj=new Box();
		obj.display('a', 10);
		obj.display(10, 'a');
		obj.display(10);
		

	}

}
