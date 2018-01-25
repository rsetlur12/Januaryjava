package core_java;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner value = new Scanner(System.in);

	        double weight = 0;
	        double height = 0;
	        double bmi = 0;

	        System.out.println("Enter your weight in pounds: ");
	        weight = value.nextInt();

	        System.out.println("Enter your height in inches: ");
	        height = value.nextInt();

	        bmi = weight/(height*height)*703;

	        System.out.println("Your BMI is "+bmi);
	        
	        if (bmi<18.5)
	        
	        System.out.println("BMI is less than 18.5");
	        System.out.println("Result: Underweight");
	        
	        if (bmi >=18.5 && bmi <=24.9)
	        
	        System.out.println("BMI is between 18.5 & 24.9");
	        System.out.println("Result: Normal weight");
	        
	        if (bmi>=25 && bmi<=29.9)
	        
	        System.out.println("BMI is between 25 & 29.9");
	        System.out.println("Result: Overweight");

	        if (bmi>=30)
	        
	        System.out.println("BMI more than 30");
	        System.out.println("Obese");

	}

}
