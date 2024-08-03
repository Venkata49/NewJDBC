package SmallStudentProject;

import java.util.Scanner;


public class empControllerScanner {

	public static void main(String[] args) {
		
		empController ec = new empController();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("please enter operation : ");
		String value = sc.next();
		
		switch(value) {
		
		case "insert":
			emp e = new emp();
			System.out.println("Enter the empid :");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter the empName :");
			e.setEmpName(sc.next());
			System.out.println("Enter the empAge :");
			e.setEmpage(sc.nextInt());
			System.out.println("Enter the empDes :");
			e.setEmpDes(sc.next());
			System.out.println("Enter the empSAl :");
			e.setEmpsal(sc.nextDouble());
			
			ec.save(e);
			break;
			
		case "update":
			System.out.println("Enter the empSAl :");
			double sal = sc.nextDouble();
			System.out.println("Enter the empid :");
			int id = sc.nextInt();
			ec.update(sal, id);
			break;
			
		case "delete":
			System.out.println("Enter the empid :");
			ec.delete(sc.nextInt());
			
			break;
			
		case "getbyname":
			System.out.println("Enter the empid :");
			ec.getByName(sc.next());
			break;
			
		default : System.out.println("Check the choice...");
		}
	}

}
