package core_java;


// constructor is a instance method that usually has the same class name
// constructor should always be non-static
public class Constructor {
	
	int age;             // variables without values
	long salary;          // default value for int =0; string = null
	double number;
	String name;
	
	Constructor(){
		int age =20;        //constructor method is assigning new default values to int and string
		long salary=6000;
		double number = 16.74;
		String name="Sameer";
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(number);
		System.out.println(name);

	}

	public static void main(String[] args) {

	new Constructor();  // executing the constructor method
			
	}

}
