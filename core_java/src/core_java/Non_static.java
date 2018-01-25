package core_java;

public class Non_static {
	// to call a non static function we have to create an object
// Object is instance of a class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non static function is easier to access
		// can be called everywhere easily

		Non_static x=new Non_static(); // Instance of a class(object)
		x.car();
		x.flower();
		x.school();
		x.quotes();
	}
public void car() {  //non-static function
	System.out.println("Toyota");
}
public void flower() {
	System.out.println("Rose");
	}
public void school() {
	System.out.println("Harvard Med School");
}
public void quotes() {
	System.out.println("I solemnly swear I'm upto no good");
}
}
