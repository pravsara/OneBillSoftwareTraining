package com.onebill.corejava.basics.inheritance;

class TwoDShape {
	double width;
	double height;
	void showDimension() {
		System.out.println("Width and Heigth are: " + width+ "and"+ height);
	}
}

class Triangle extends TwoDShape {
	String style;
	void showStyle() {
		System.out.println("Triangle is: "+ style);
	}
	double calculateArea() {
		return width*height/2;
	}
}
public class shapes {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 4.0;
		t1.height = 3.5;
		t1.style = "with border";
		
		t2.width = 8.0;
		t2.height = 8.5;
		t2.style = "without border";
		
		System.out.println("Information related to t1 object:");
		t1.showStyle();
		t1.showDimension();
		System.out.println(t1.calculateArea());
		
		System.out.println("Information related to t2 object:");
		t2.showStyle();
		t2.showDimension();
		System.out.println(t2.calculateArea());
		
	}

}
