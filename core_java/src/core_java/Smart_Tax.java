package core_java;

import java.util.Scanner;

public class Smart_Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Smart_Tax();
	}
		
public static void Smart_Tax() {
		
		Scanner reader = new Scanner(System.in);
		int Prd_cost = 85;
		int Total = Prd_cost+4;
		
		
		System.out.println("Which product would you like to know?");
		String prd_name = reader.next();
		
		switch(Prd_cost) {
		
		case 75:
			System.out.println("The price of Standard edition including taxes is "+ "$"+ Total);
			break;
		case 85:
			System.out.println("The price of Premier edition including taxes is "+"$" + Total);
			System.out.println("The Premier edition is ideal for Business owners");
			break;
		case 95:
			System.out.println("The price of Deluxe edition including taxes is "+"$"+ Total);
			System.out.println("The Deluxe edition is ideal for home owners");
			break;
			
		}
	
		try {
			
			Scanner input = new Scanner(System.in);
						
			System.out.println("Provide the Product ID you are interested in");
			int x = input.nextInt();
			
			int Prd_ID = 301;
						
			switch(Prd_ID) {
			
			case 101:
				System.out.println("The product ID you provided is for the Standard edition");
				System.out.println("Standard edition costs $79 including taxes");
				break;
			case 201:
				System.out.println("The product ID you provided is for the Premier edition");
				System.out.println("The Premier edition is ideal for Business owners and costs $89 including taxes");
				break;
			case 301:
				System.out.println("The product ID you provided is for the Deluxe edition");
				System.out.println("The Deluxe edition is ideal for home owners and costs $99 including taxes");
				break;
		}
			}
          catch (Exception e) {
        	  
        	  System.out.println("Error: String value was input, number value expected");
	
	          System.out.println("Input a number value");
}
		finally {
			
			System.out.println("Thank you for shopping with Smart Tax");
		}
		
	}
}
