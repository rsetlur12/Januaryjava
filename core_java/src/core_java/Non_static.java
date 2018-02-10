package core_java;

public class Non_static {
	// to call a non static function we have to create an object
// Object is instance of a class
	
	static int v= 7000; // static global variable
	int g = 400; // non-static global variable
	String s ="Scotland";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non static function is easier to access
		// can be called everywhere easily
			car();
					
			Non_static x =new Non_static();
			x.Division(75,15);
			x.Multiply(15,5);
			x.food();
			x.Destination(); // calling non-static global variable
			Phone();
	
			System.out.println(x.g);
			System.out.println("I would love to visit "+x.s);
	}
public static void car() // static function
{
	System.out.println("I love my car");
}

public void food() //non-static function
{
	System.out.println("I am a vegetarian");
}
public void Destination()
{
	System.out.println("My dream is to go to Inverness");
}
public void Books()
{
	System.out.println("Outlander series is one of my favorite");
	System.out.println(s);
}
public void Division(int a, int b)
{
int c = a/b;
System.out.println("The answer is "+c);
}

public void Multiply(int r, int s)
{
	int t = r*s;
	System.out.println("The multiplication answer is "+t);
}

private static void Phone() { // protect a function and not use it any other class
	// private function can't be inherited
	System.out.println("I like my iphone");
}
}
	