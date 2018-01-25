package core_java;

import java.util.Scanner;

public class Input_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		//scanner object with input argument
	 
		System.out.println("What is you age?");
	 int age=reader.nextInt(); // provide you input & reading your input
	 System.out.println("Your age is "+age); // prints your input
	 
	 System.out.println("What is you name?");
	 String name=reader.next(); // provide you input & reading your input
	 System.out.println("Your name is "+name); // prints your input
	
	 System.out.println("What is you city?");
	 String city=reader.next(); // provide you input & reading your input
	 System.out.println("Your city is "+city); // prints your input
		
	}

}
