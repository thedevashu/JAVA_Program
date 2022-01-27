package student;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		Student [] s=new Student[5];
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter roll no:");
			int roll =scn.nextInt();
			
			System.out.println("Enter Name: ");
			String st =scn.next();
			
			System.out.println("Has exp?");
			boolean b=scn.nextBoolean();
			s[i] = new Student(roll,st,b);
		}
		
		for (int i = 0; i < s.length; i++) {
			s[i].showStudentInfo();
			
		}
	}
	
	
}
