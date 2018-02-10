package core_java;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Difference between single = & ==
				// = means if you are assigning something ex: int x=4; int y=3;
				// == used for comparing strings x==y
		// example of operators are =,==, <=,>=,<,>,&,&&;
		// & is when you want to execute 2 operations;
		// && evaluates the left side of the operation to the right side and it assures both sides need to be met

				
				int x = 3;
				int y = 4;
				
				if(x==y)
				{
					System.out.println("They are equal");
				}
				else
				{
					System.out.println("They are not equal");
				}
				
		//	System.out.println(x & y);
				if (x==y&&x>y)
				{
					System.out.println("x & y can't be real");
							}
				else
				{
					System.out.println("This logic does not make sense");
				}
	}


			}



