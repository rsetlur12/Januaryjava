package core_java;

public class Double_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Destinations[][]=new String [4][4];
		
		int rows = Destinations.length;
		int cols = Destinations[0].length;
		
		// first row:
		
		Destinations [0][0]= "Dallas";
		Destinations [0][1]= "Los Angeles";
		Destinations [0][2]= "Austin";
		Destinations [0][3]= "New York City";
		
		//second row:
		Destinations [1][0]= "Anchorage";
		Destinations [1][1]= "Madison County";
		Destinations [1][2]= "Phoenix";
		Destinations [1][3]= "Las Vegas";
		
		//third row:
		Destinations [2][0]= "San Francisco";
		Destinations [2][1]= "Maine";
		Destinations [2][2]= "Maui";
		Destinations [2][3]= "Honolulu";
		
		//fourth row:
		Destinations [3][0]= "New Jersey";
		Destinations [3][1]= "Salt Lake City";
		Destinations [3][2]= "Houston";
		Destinations [3][3]= "Flagstaff";

//argument for rows:
		for (int rownum =0; rownum<rows; rownum++) {
			
//argument for columns:
			for (int colnum =0; colnum<cols; colnum++) {

		System.out.println(Destinations[rownum][colnum]);
	}
		}
}
}
		