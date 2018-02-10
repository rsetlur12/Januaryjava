package core_java;

import java.util.Scanner;

public class Assignments_02032018 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner reader = new Scanner(System.in);
		//scanner object with input argument
	 
	 System.out.println("What is your age?");
	 int age=reader.nextInt(); // provide your input & reading your input
	 
	 System.out.println("What is your name?");
	 String name=reader.next(); 
	
	 
	 System.out.println("What is your salary?");
	 short salary=reader.nextShort(); 
	 
	 System.out.println("What is your address?");
	 int address=reader.nextInt(); 
	 String streetname = reader.next();
	 String streetname2 = reader.next();
	 
	 System.out.println("What is your city?");
	 String city=reader.next(); 
	 
	 System.out.println("What is your zipcode?");
	 long zip = reader.nextLong();
	 
	 System.out.println("Your age is "+age); // prints your input
	 System.out.println("Your name is "+name); 
	 System.out.println("Your salary is "+salary);
	 System.out.println("Your address is "+address+ " "+streetname+ " "+streetname2); 
	 System.out.println("Your city is "+city); 	
	 System.out.println("Your zipcode is "+zip);
	}

}

