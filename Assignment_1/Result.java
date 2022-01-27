/*10. The marks obtained by a student in 5 different subjects are input through the keyboard. The student gets a division as per the following rules: Percentage above or equal to 60 - First division 
Percentage between 50 and 59 - Second division 
Percentage between 40 and 49 - Third division 
Percentage less than 40 - Fail 
Write a Java program to calculate the division obtained by the student.*/

import java.util.Scanner;

public class Result{		

	int m1,m2,m3,m4,m5;
	int per;
	Scanner scn = new Scanner(System.in);
	void readMarks(){
		System.out.println("Enter sub1 marks :");
		m1 = scn.nextInt();

		System.out.println("Enter sub2 marks /100 :");
		m2 = scn.nextInt();

		System.out.println("Enter sub3 marks /100 :");
		m3 = scn.nextInt();

		System.out.println("Enter sub4 marks /100:");
		m4 = scn.nextInt();

		System.out.println("Enter sub5 marks /100:");
		m5 = scn.nextInt();
	}
	
	void display(){
		
		per = (m1+m2+m3+m4+m5)/5;
		System.out.println("Percentage of student  = "+ per);
	}
	
	void Division(){
		if(per >= 60){
			System.out.println("First Class :");
		}
		
		if(per <= 59 && per >= 50){
			System.out.println("Second Class :");
		}
		
		if(per <= 49 && per >= 40){
			System.out.println("third Class :");
		}
		
		if(per <= 39){
			System.out.println("Fail:");
		}
	}
	
	
	
	public static void main(String [] args){
		Result r1 = new Result();
		r1.readMarks();
		r1.display();
		r1.Division();
		
		
	}
}