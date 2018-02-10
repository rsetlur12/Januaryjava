package core_java;

public class Credit_Score_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int creditscore = 650;
	/*	int  score = 750;
		
		switch(score) {
		
		case 750:
			System.out.println("Your credit score is excellent!");
			break;
		case 650:
			System.out.println("Your credit score is good");
			break;
		case 550:
			System.out.println("Your credit score is fair");
			break;
		case 500:
			System.out.println("Your credit score is poor");
			break;
		case 450:
			System.out.println("Your credit score is bad");
			break;
		default:
			System.out.println("I don't know your credit score");
			break;
			
			}*/
		
		if (creditscore >=750){
			
			System.out.println("Your credit score is excellent");
		}
			
		if (creditscore >=700 && creditscore <750)
			{			
			System.out.println("Your credit score is good");
		}
		if (creditscore >=650 && creditscore <=699)
		{
			System.out.println("Your credit score is fair");
		}
		if (creditscore >=550 && creditscore <=649)
		{
			System.out.println("Your credit score is poor");
		}
		if (creditscore <550)
		{
			System.out.println("Your credit score is bad");
		}
		else
		{
			System.out.println("I don't know your credit score");
		}
			
	}
	}

