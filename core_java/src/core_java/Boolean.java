package core_java;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean is an expression that returns true or false
		
	//	boolean b = true;
	//	System.out.println(200==200);
		
	//	System.out.println(200==250);
		
		int size=100;
		
		String color = "Blue";
		boolean largeandblue = size>=50 && color == "Blue";
		
		//Test our boolean
		if(largeandblue)
			
		{
			System.out.println("Largeandblue = "+ largeandblue);
		}
		else
		{
			System.out.println("Largeandblue = False");
		
		}
	}
}
