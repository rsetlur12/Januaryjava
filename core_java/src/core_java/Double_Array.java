package core_java;

public class Double_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Flights[][]=new String [4][4];
		
		int rows = Flights.length;
		int cols = Flights[0].length;
		
		// first row:
		
		Flights [0][0]= "Dallas";
		Flights [0][1]= "Los Angeles";
		Flights [0][2]= "Austin";
		Flights [0][3]= "New York City";
		
		//second row:
		Flights [1][0]= "Anchorage";
		Flights [1][1]= "Madison County";
		Flights [1][2]= "Phoenix";
		Flights [1][3]= "Las Vegas";
		
		//third row:
		Flights [2][0]= "San Francisco";
		Flights [2][1]= "Maine";
		Flights [2][2]= "Maui";
		Flights [2][3]= "Honolulu";
		
		//fourth row:
		Flights [3][0]= "New Jersey";
		Flights [3][1]= "Salt Lake City";
		Flights [3][2]= "Houston";
		Flights [3][3]= "Flagstaff";

//argument for rows:
		for (int rownum =0; rownum<rows; rownum++) {
			
//argument for columns:
			for (int colnum =0; colnum<cols; colnum++) {

		System.out.println(Flights[rownum][colnum]);
	}
		}
}
}
		