package core_java;


public class Books_Quotes {
	
	int Number_of_books;
	String Author;
	
	Books_Quotes(){ // constructor method
		
		int Number_of_books = 8;
		String Author= "J.K.Rowling";
		
		System.out.println("Number of books in the HP series is " +Number_of_books);
		System.out.println("The author of Harry Potter series is "+Author);
		
		System.out.println("Ofcourse it's happening in your head Harry, but why on earth should that mean it's not real?");
        System.out.println("I solemnly swear I'm up to no good");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Books_Quotes(); // executes the constructor
	}

}
