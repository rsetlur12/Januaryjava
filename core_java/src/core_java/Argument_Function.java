package core_java;

public class Argument_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum(4,5);
Addition(5,7,11);
Sub(10,3);
Print("John");
Age("Ramya", 40);
		
	}
public static void Sum(int x, int y) 
{
		System.out.println(x+y);
}

public static void  Addition(int a, int b, int c) 
{
	int x = a+b+c;
			System.out.println(x);
}

public static void Sub(int x, int y)
{

int z = x-y;
System.out.println("The result is " +z);
}

public static void Print(String x)
{
	System.out.println(x);
}
public static void Age(String name, int age)
{
	System.out.println("My name is "+name);
	System.out.println("My age is "+age);
}
}