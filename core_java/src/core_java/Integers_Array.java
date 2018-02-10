package core_java;

public class Integers_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int FibonacciSeq[]= new int[10];
		
		FibonacciSeq[0] = 0;
		FibonacciSeq[1] = 1;
		FibonacciSeq[2] = 1;
		FibonacciSeq[3] = 2;
		FibonacciSeq[4] = 3; 
		FibonacciSeq[5] = 5;
		FibonacciSeq[6] = 8;
		FibonacciSeq[7] = 13;
	    FibonacciSeq[8]	= 21;
	  	FibonacciSeq[9] = 34;
	  	
		System.out.println("Fibonacci Sequence is:");

		for
		(int x=0; x<FibonacciSeq.length; x++)
		{
			System.out.println(FibonacciSeq[x]);
			
		}
		
		int Multiples_5[][]= new int[5][5];
		
		int rows = Multiples_5.length;
		int cols = Multiples_5[0].length;
		
		//first row:
		Multiples_5[0][0] = 5;
		Multiples_5[0][1] = 10;
		Multiples_5[0][2] = 15;
		Multiples_5[0][3] = 20;
		Multiples_5[0][4] = 25;
		
		//second row:
		Multiples_5[1][0] = 30;
		Multiples_5[1][1] = 35;
		Multiples_5[1][2] = 40;
		Multiples_5[1][3] = 45;
		Multiples_5[1][4] = 50;
		
		//third row:
		Multiples_5[2][0] = 55;
		Multiples_5[2][1] = 60;
		Multiples_5[2][2] = 65;
		Multiples_5[2][3] = 70;
		Multiples_5[2][4] = 75;
		
		//fourth row:
		Multiples_5[3][0] = 80;
		Multiples_5[3][1] = 85;
		Multiples_5[3][2] = 90;
		Multiples_5[3][3] = 95;
		Multiples_5[3][4] = 100;
		
		//fifth row:
		Multiples_5[4][0] = 105;
		Multiples_5[4][1] = 110;
		Multiples_5[4][2] = 115;
		Multiples_5[4][3] = 120;
		Multiples_5[4][4] = 125;
		
		System.out.println("Multiples of 5:");
		
		//argument for rows:
				for (int rownum =0; rownum<rows; rownum++) {
					
		//argument for columns:
					for (int colnum =0; colnum<cols; colnum++) {

				System.out.println(Multiples_5[rownum][colnum]);
			}
				}
		
		
				
			
						}

}
