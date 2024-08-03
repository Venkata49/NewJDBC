package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentExecute {

	public void insertData(StudentPOJO std) {
		
		System.out.println("Save data into Student data :");
		System.out.println(std);

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String insertQ = "insert into data.student_details values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(insertQ);
			
			ps.setInt(1, std.getSid());
			ps.setString(2, std.getSname());
			ps.setInt(3, std.getSage());
			ps.setString(4, std.getSgroup());
			ps.setDouble(5, std.getSmarks());
			
			int row = ps.executeUpdate();
			System.out.println("rows inserted  : "+row);

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void update(double smarks, int sid) {
		System.out.println(smarks+"update data into Student data :"+sid);
		System.out.println(sid);
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update = "update data.student_details set smarks = ? where sid = ?";
			PreparedStatement ps = con.prepareStatement(update);
			ps.setDouble(1, smarks);
			ps.setInt(2, sid);
			
			int row = ps.executeUpdate();
			System.out.println("no of row updated :"+row);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

		
	}
	public void delete(int sid) {
		System.out.println("delete data into Student data :"+sid);
		System.out.println(sid);
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update = "delete from data.student_details  where sid = ?";
			PreparedStatement ps = con.prepareStatement(update);
			ps.setInt(1, sid);
			
			int row = ps.executeUpdate();
			System.out.println("no of row deleted :"+row);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	public void getById(int sid) {
		System.out.println("getById data into Student data :"+sid);
		System.out.println(sid);
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update = "select* from data.student_details  where sid = ?";
			PreparedStatement ps = con.prepareStatement(update);
			ps.setInt(1, sid);
			
			ResultSet rs =  ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("sid")+"="+rs.getString("sname")+"="+rs.getInt("sage")+"="+rs.getString("sgroup")+"="+rs.getDouble("smarks"));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
	public void getByName(String sname) {
		System.out.println("getById data into Student data :"+sname);
		System.out.println(sname);
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update = "select* from data.student_details  where sname = ?";
			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(1, sname);
			
			ResultSet rs =  ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("sid")+"="+rs.getString("sname")+"="+rs.getInt("sage")+"="+rs.getString("sgroup")+"="+rs.getDouble("smarks"));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	public void getAll() {
		
		System.out.println("getall data into Student data :");
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update = "select* from data.student_details";
			PreparedStatement ps = con.prepareStatement(update);			
			ResultSet rs =  ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("sid")+"="+rs.getString("sname")+"="+rs.getInt("sage")+"="+rs.getString("sgroup")+"="+rs.getDouble("smarks"));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
