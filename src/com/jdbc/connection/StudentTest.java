package com.jdbc.connection;

public class StudentTest {

	public static void main(String[] args) {

		StudentExecute se = new StudentExecute();
		
		StudentPOJO sp = new StudentPOJO();
//		
//		sp.setSid(1);
//		sp.setSname("siva");
//		sp.setSage(24);
//		sp.setSgroup("mca");
//		sp.setSmarks(53.00);
//		
//		se.insertData(sp);
//		se.update(99.45, 2);
//		se.delete(3);
//		se.getById(4);
//		se.getByName("siva");
		se.getAll();
		
	}

}
