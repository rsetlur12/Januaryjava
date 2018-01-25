package core_java;

public class Global_local {

	static int c =550;// global variable can be called in any function
	int b=200; // non static global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		age();
		salary();
		System.out.println(c);
		
		Global_local r = new Global_local();
		System.out.println(r.b);
	}

public static void age() {
	int x = 3;
	System.out.println(x);
	// x is local to the function age
	System.out.println(c);
	Global_local s=new Global_local();
	System.out.println(s.b);
}
public static void salary() {
	int y = 300;
	System.out.println(y);
	//y is local to the function salary
	System.out.println(c);

}
public static void apple() {
	System.out.println(c);
}

	}


