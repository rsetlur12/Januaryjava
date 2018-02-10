package core_java;

public class Employees_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Employee_DeptName[][]= new String[3][3];
		
		int rows = Employee_DeptName.length;
		int cols = Employee_DeptName[0].length;
		
		//first row:
		Employee_DeptName[0][0] = "John Smith";
		Employee_DeptName[0][1] = "Mary Smith";
		Employee_DeptName[0][2] = "Jennifer Smith";
		
		//second row:
		Employee_DeptName[1][0] = "HR";
		Employee_DeptName[1][1] = "Operations";
		Employee_DeptName[1][2] = "Business Solutions";
		
		//third row:
		Employee_DeptName[2][0] = "HR Manager";
		Employee_DeptName[2][1] = "Director";
		Employee_DeptName[2][2] = "Business Manager";
		
		//argument for rows:
				for (int rownum =0; rownum<rows; rownum++) {
					
		//argument for columns:
				for (int colnum =0; colnum<cols; colnum++) {

				System.out.println(Employee_DeptName[rownum][colnum]);
			}
				}
	}

}
