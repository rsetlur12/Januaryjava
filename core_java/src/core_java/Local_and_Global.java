package core_java;

public class Local_and_Global {

	static int c= 6000; //Global variable can be called from any function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(c);
		salary();
		DreamSalary();
	}
public static void salary()
{
	int a=7000;
	System.out.println(a+c);
}
public static void DreamSalary()
{
	int b=10000;
	System.out.println(b);

}
}
