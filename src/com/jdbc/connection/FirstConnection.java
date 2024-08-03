package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstConnection {
	
public static void main(String[] args) {
		
		try {
			System.out.println("Started....");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			Statement st=con.createStatement();
//			String insertQuery = "insert into data.employe values(101,'venkata kumar',45000.89,'software engineer') ";
//			String insertQuery = "insert into data.employe values(102,'hari das',23000.33,'software engineer') ";
			String insertQuery = "delete from data.employe where empid=101";


			int row = st.executeUpdate(insertQuery);
			System.out.println("deleted here....");
			System.out.println("End here...");
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

	
/*	public static void main(String[] args) {
		
		try {
			System.out.println("Started....");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			Statement st=con.createStatement();
//			String insertQuery = "insert into data.employe values(101,'venkata kumar',45000.89,'software engineer') ";
//			String insertQuery = "insert into data.employe values(102,'hari das',23000.33,'software engineer') ";
			String insertQuery = "update data.employe set empname='datha kumar' where empid=102 ";


			int row = st.executeUpdate(insertQuery);
			System.out.println("Row is updated....");
			System.out.println("End here...");
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
*/
	/* public static void main(String[] args) {
		
		try {
			System.out.println("Started....");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			Statement st=con.createStatement();
//			String insertQuery = "insert into data.employe values(101,'venkata kumar',45000.89,'software engineer') ";
//			String insertQuery = "insert into data.employe values(102,'hari das',23000.33,'software engineer') ";
			String insertQuery = "insert into data.employe values(103,'munna patel',60000.01,'Manager') ";


			int row = st.executeUpdate(insertQuery);
			System.out.println("Row is inserted....");
			System.out.println("End here...");
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
	*/

}
