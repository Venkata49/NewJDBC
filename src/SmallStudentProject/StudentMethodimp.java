package SmallStudentProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentMethodimp {
	
	public void insert(StudentDetails st) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","tiger");
			String insertQ = "insert into data.std values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(insertQ);
			
			
			ps.setInt(1, st.getSid());
			ps.setString(2, st.getSname());
			ps.setInt(3, st.getSage());
//			ps.setString(4, std.getSgroup());
//			ps.setDouble(5, std.getSmarks());
			
			int row = ps.executeUpdate();
			System.out.println("rows inserted  : "+row);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
}
