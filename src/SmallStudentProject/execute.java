package SmallStudentProject;

import java.util.Scanner;

public class execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMethodimp im = new StudentMethodimp();

			StudentDetails sd = new StudentDetails();
			Scanner sc = new Scanner(System.in);

			System.out.println("enter sid :");
			int s = sc.nextInt();
			if(s != sd.getSid()) {
				sd.setSid(s);
			}else {
				System.out.println("entered data already exists enter again ....:");
				sd.setSid(sc.nextInt());
			}
			System.out.println("enter sname :");
			sd.setSname(sc.next());
			System.out.println("enter sage :");
			sd.setSage(sc.nextInt());
im.insert(sd);
			

		}


	}


