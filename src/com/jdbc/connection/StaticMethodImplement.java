package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StaticMethodImplement {
	
//	3 Types to statements are there 1.statement , 2.prepared statement  , 3.callable statement....
	
	static void insertMethod() {
		
		
		try {
			
			System.out.println("Connection Started ....");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			Statement st=con.createStatement();
			String insertQuary  = "insert into data.student values(01,'Venakta kumar',24,52000.00)";
			int ex = st.executeUpdate(insertQuary);
			
			System.out.println("Row inserted...");
			st.close();
			con.close();
			System.out.println("all closed...");
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insertMethod();		
	}
		
}
