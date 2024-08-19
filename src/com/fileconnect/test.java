package com.fileconnect;		//24-2024

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class test {

	public static ArrayList<employee> getfiledata() {
		ArrayList<employee> data = new ArrayList<>();
		
		try {
			FileReader fr  = new FileReader("C:\\Learner\\usage\\employee.txt");
			BufferedReader br = new BufferedReader(fr);
			
			for(String s = br.readLine(); s!=null; s= br.readLine()) {
				String[] k = s.split(",");
				employee e = new employee(Integer.parseInt(k[0]), k[1], Integer.parseInt(k[2]), k[3], Double.parseDouble(k[4]));
				data.add(e);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return data;
		
	}
	public static void main(String[] args) {

		ArrayList<employee> data = test.getfiledata();
		
		try {
			System.out.println("Connection started..");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connect","root","tiger");

			String inq = "insert into connect.employee values(?,?,?,?,?)";
			for(int i=0;i<=data.size()-1;i++) {
				PreparedStatement ps = con.prepareStatement(inq);
				ps.setInt(1, data.get(i).getEid());
				ps.setString(2, data.get(i).getEname());
				ps.setInt(3, data.get(i).getEage());
				ps.setString(4, data.get(i).getEdesg());
				ps.setDouble(5, data.get(i).getEsal());
				
				int row = ps.executeUpdate();
				System.out.println("No of rows inserted"+row);

			}
			System.out.println("Insertion completed..");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
