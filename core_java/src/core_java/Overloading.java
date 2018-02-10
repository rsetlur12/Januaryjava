package core_java;

public class Overloading {

	//Overloading is where 2 functions have the same name but different arguments
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numbers(6,12);
		numbers(6.7);
		String("Lily");
				
	}
public static void numbers(int c, int d) {
	
	System.out.println(c+d);
}
public static void numbers(double c) {
	
	System.out.println(c);
}
public static void String(String s) {
	
	System.out.println(s);
	
}
}
