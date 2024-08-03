package com.jdbc.connection;

import java.util.Scanner;

public class InputStudentValuesUsingScanner {

	public static void main(String[] args) {
		
		StudentExecute se = new StudentExecute();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose what you want : ");
		String input = sc.next();
		StudentPOJO sp = new StudentPOJO();

		switch(input) {
		case "insert":
			System.out.println("Enter sid :");
			sp.setSid(sc.nextInt());
			System.out.println("Enter sname :");
			sp.setSname(sc.next());
			System.out.println("Enter sage :");
			sp.setSage(sc.nextInt());
			System.out.println("Enter sgroup :");
			sp.setSgroup(sc.next());
			System.out.println("Enter smarks :");
			sp.setSmarks(sc.nextDouble());
			
			se.insertData(sp);
			break;
			
		case "update":
			System.out.println("Enter data which sid to update :");
			int id = sc.nextInt();
			System.out.println("Enter data which marks you wana update :");
			Double mar = sc.nextDouble();
			se.update( mar,id);
			
			break;
			
			
		case "delete":
			System.out.println("Enter data which sid to delete :");
			int d = sc.nextInt();
			se.delete(d);
			break;
			
		case "getById":
			System.out.println("Enter data which sid you wana get :");
			int d1 = sc.nextInt();
			se.getById(d1);
			
			break;
			
		case "getByName":
			System.out.println("Enter data which sname you wana get :");
			String s = sc.next();
			se.getByName(s);
			break;
			
		case "getAll":
			se.getAll();
			break;
			default :
				System.out.println("Nothing here...");
		}

		
		
	}

}
