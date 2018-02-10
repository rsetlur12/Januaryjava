package core_java;

public class Inheritance_HW extends Assignments{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Inheriting functions from Assignments class

		Division();
		Perimeter();
		Boolean();
				
		Values(16,16);
		Values("The"," " + "Outlander");
	}
public static void Boolean(){  // overriding values for Boolean function
	
	int x = 15;
	int y = 20;
	int z = 40;
	
	boolean Total = z==35;
	System.out.println("The answer is "+ Total);
}
public static void Values(int x, int y) {  // overloading function
	
	int a = x+y;
	System.out.println(a);
}
public static void Values(String r, String s) {  // overloading function
	
	String l =  r+s;
	System.out.println("My favorite TV series is "+l);
}
}
