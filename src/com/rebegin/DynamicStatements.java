package com.rebegin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DynamicStatements {						//7-17-2024
	
	public void selectQuery() {
		
	try {
		System.out.println("Insertion started..");
		
		Class.forName("com.mysql.cj.jdbc.Driver");//Class is a class name...
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");//Connection is an interface..
		Statement st = con.createStatement();//Statement is interface..
//		String selectQuery = "select * from data.student_details ";
		String selectQuery = "select * from data.student_details where sid = 3";

		
		ResultSet rs = st.executeQuery(selectQuery);
		while(rs.next()) {//is boolean method in ResultSet interface...
			
			int sid = rs.getInt("sid");//getInt is a column in ResultSet interface...
			String sname = rs.getString("sname");
			int sage = rs.getInt("sage");
			String sgroup = rs.getString("sgroup");
			double smarks = rs.getDouble("smarks");
			
			System.out.println(sid+"=="+sname+"=="+sage+"=="+sgroup+"=="+smarks);

		}
		
		
		System.out.println("completed..");
	} catch (Exception e) {

	}
		
	}
	

}
