package core_java;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum(); 
		Subtract();
		argument_sum(8,7); 
		argument_subtract(5,10);
	}

	private static void Subtract() {
		// TODO Auto-generated method stub
	
		int a = 9-8;
		System.out.println(a);
	}

	private static void argument_subtract(int x, int y) {
		// TODO Auto-generated method stub
		int subtraction = x-y;
		System.out.println(subtraction);
	}

	private static void argument_sum(int a, int b) {
		// TODO Auto-generated method stub
		int addition = a+b;
		System.out.println(addition);
		
	}

	private static void Sum() {
		// TODO Auto-generated method stub
		
		int add = 9+8;
		System.out.println(add);
		
	}

}
