import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] s =new Student[5];
		Scanner scn =new Scanner(System.in);
		System.out.print("Enter no. of Students :");
		int studentsNo = scn.nextInt();
		
		for(int i=0;i<studentsNo;i++) {
			String n ="";
			int a =0;
			int m[] = new int[5];
			
			 
			
			
			System.out.println("Enter Student name :");
			n = scn.next();
			
			System.out.println("Enter Student Age. :");
			a =scn.nextInt();
			s[i] = new Student(n,a);
			System.out.println("Enter Student Marks :");
			for(int i1 =0 ;i1<5;i1++) {
			m[i1] = scn.nextInt();
			}
			//s[i].setMarks(m);
			
			
		}
		for (int i = 0; i < studentsNo; i++) {
			System.out.println(s[i]);
			
		}
		
	}
}
	/*
		String s ="";
		int a =0;
		int m[] = new int[5];
		
		Student s1 ;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Student name :");
		s = scn.next();
		
		System.out.println("Enter Student Age. :");
		a =scn.nextInt();
		
		System.out.println("Enter Student Marks :");
		for(int i =0 ;i<5;i++) {
		m[i] = scn.nextInt();
		}
		s1 =new Student(s,a,m);
		System.out.println(s1);
		
	}
	

}

*/
