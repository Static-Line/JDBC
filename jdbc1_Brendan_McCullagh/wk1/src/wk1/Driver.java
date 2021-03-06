package wk1;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {

		
		try {
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "student");
			
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
				System.out.println(myRs.getString("id"));
				System.out.println(myRs.getString("salary"));
				System.out.println(myRs.getString("department"));
				System.out.println(myRs.getString("department"));
			}
		}
		
		catch (Exception exc) {
			exc.printStackTrace(); 
		}
	}
}