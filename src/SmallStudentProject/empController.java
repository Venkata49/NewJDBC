package SmallStudentProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class empController {
	
	public void save(emp em) {			//		7-17-2024
		
		System.out.println("save operation started...");
		System.out.println(em);
		
		try {
			
			System.out.println("Insertion started..");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String iquery = "insert into data.emp values(?,?,?,?,?)";//?? means lables..
			PreparedStatement ps = con.prepareStatement(iquery);
			
			ps.setInt(1, em.getEmpid());//setInt(0, 0 ) these are  under prepareStatement...
			ps.setString(2,em.getEmpName() );
			ps.setInt(3, em.getEmpage());
			ps.setString(4, em.getEmpDes());
			ps.setDouble(5, em.getEmpsal());
			
			int row = ps.executeUpdate();
			System.out.println("One row inserted...."+row);
			System.out.println("save operation completed..");

		} catch (Exception e) {
			
		}
		
		
	}
	public void update(double sal, int id) {
		
		System.out.println(sal +"update operation started..."+ id);
		try {
			System.out.println("Insertion started..");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update1 = "update data.emp set empSal =? where empid =?";
			PreparedStatement ps = con.prepareStatement(update1);
			ps.setDouble(1, sal);
			ps.setInt(2, id);
			
			int row = ps.executeUpdate();
			System.out.println("one row updated ..."+ row);
			System.out.println("update operation completed..");

		} catch (Exception e) {
			
		}
		
	}
	public void delete(int eid) {
		System.out.println("dalete operation started...");
		try {
			System.out.println("Insertion started..");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update1 = "delete from  data.emp  where empid =?";
			PreparedStatement ps = con.prepareStatement(update1);
			ps.setInt(1, eid);
			
			int row = ps.executeUpdate();
			System.out.println("one row deleted ..."+ row);
			System.out.println("delete operation completed..");

		} catch (Exception e) {
			
		}
		
		
	}
	public void getByName(String empName) {
		System.out.println("getByName operation started...");
		try {
			System.out.println("Insertion started..");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String update1 = "select*from data.emp where empName= ?";
			PreparedStatement ps = con.prepareStatement(update1);
			ps.setString(1, empName );

			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("empid")+" ="+rs.getString("empName")+" ="+rs.getInt("empage")+" ="+rs.getString("empDes")+" ="+rs.getDouble("empSal"));
				
			}
			System.out.println("getByName operation completed..");

		} catch (Exception e) {
			
		}
		
		
	}
}
