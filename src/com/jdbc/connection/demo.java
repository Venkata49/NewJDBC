package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


// JDBC STARTED IN 7-16-2024...

public class demo {
	public static void main(String[] args) {
		try {
			System.out.println("Started....");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			Statement st=con.createStatement();
			String seletQue = "select*from data.employe where empid =102";
			ResultSet rs = st.executeQuery(seletQue);
			
			while(rs.next()) {
				int empid = rs.getInt("empid");
				String empname = rs.getString("empname");
				double empsal = rs.getDouble("empsal");
				String empdes = rs.getString("empdes");
				System.out.println(empid+","+empname+","+empsal+","+empdes);
				
			}
			
			
			System.out.println("Completed...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
