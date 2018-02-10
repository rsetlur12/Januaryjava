package core_java;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add();
		Division();
		Perimeter();
		Boolean();
	}
public static void Add() {
	
	int a = 74+36;
	System.out.println("The total is " + a);
	}

public static void Division() {
	
	int b = 50/3;
	System.out.println("The answer is "+ b);
}
public static void Perimeter() {
	
	double width = 5.5;
	double height = 8.5;
	double area = width*height;
	double perimeter = 2*(width+height);
	
	System.out.println("The area of the rectangle is "+ area);
	System.out.println("The perimeter of the rectangle is "+ perimeter);
	
}
public static void Boolean() {
	
	int x = 5;
	int y = 10;
	int z = 15;
	
	boolean Total = z==15;
	System.out.println("The answer is "+ Total);
}
}
