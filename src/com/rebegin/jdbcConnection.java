package com.rebegin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcConnection {
	
	
	/*Under Connection :-
	 * createStatement() throws SQLException
	 * Under Statement :-
	 * ResultSet exexuteQuery and 
	 * int executeUpdate()
	 * 
	 * 3 Querier statements are there
	 * all query statement are under Connection interface 
	 *  
	 * 1.Statement - is throws SQLException
	 * 2.Prepare Statement
	 * 3.callable Statement
	 */
	
	public void insertion() {
		try {
			
			System.out.println("Insertion started..");
			Class.forName("com.mysql.cj.jdbc.Driver");//Class is a class name...
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");//Connection is an interface..
			Statement st = con.createStatement();//Statement is interface..
			
			
//			Insert Query for student_details table ...
			String  insert = "insert into data.student_details values(2,'phani',33,'btech',57.55)";
			int row = st.executeUpdate(insert);
			
			System.out.println("One row effected "+row);
			System.out.println("Insertion Completed...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update() {
		try {
			
			System.out.println("Insertion started..");
			Class.forName("com.mysql.cj.jdbc.Driver");//Class is a class name...
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");//Connection is an interface..
			Statement st = con.createStatement();//Statement is interface..
			
//			Update query for student_details ...
			
			String update = "update data.student_details set smarks= 78.00 where sid = 2";
			int row = st.executeUpdate(update);
			
			System.out.println("One row updated "+row);

			System.out.println("one row updated..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Delete() {
		try {
			
			System.out.println("Insertion started..");
			Class.forName("com.mysql.cj.jdbc.Driver");//Class is a class name...
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");//Connection is an interface..
			Statement st = con.createStatement();//Statement is interface..		

//			Delete query student_details...
			
			String delete = "delete from data.student_details where sid = 2";
			int row = st.executeUpdate(delete);
			
			System.out.println("One row deleted "+row);

			System.out.println("deleted completed...");
		
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
			
}
