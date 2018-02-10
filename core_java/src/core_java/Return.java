package core_java;

public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =20;
		int y = 50;
		
		int Answer = getSum(x,y);
		System.out.println("Answer is "+Answer);
	}

	private static int getSum(int x, int y) {
		// TODO Auto-generated method stub
		
		int Result = x+y;
		return Result;
	}

}
