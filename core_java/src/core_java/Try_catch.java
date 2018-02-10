package core_java;

import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {//tries the specific code
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Provide me your first integer");
		    int n=reader.nextInt();
		    System.out.println("Provide me your second integer");
		    int p=reader.nextInt();
		  
		    int sum = n+p;
		    
		  System .out.println("Your total is "+sum);
		}
			catch (Exception e) { //tries to catch every exception with "e"
			
		System.out.println(" Provide a number value");
					
		}
		finally {
			System.out.println("This is finally block");
		}
		}
	}
	

