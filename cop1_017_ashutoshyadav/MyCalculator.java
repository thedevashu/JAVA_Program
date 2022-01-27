/*.Create a class in java MyCalculator with two data members int num1,num2 .
Write Parameter less and Parameterized Constructor to initialize your data members*/

import java.util.Scanner;

public class MyCalculator{
	int num1,num2;
	
	Scanner inp = new Scanner(System.in);
	
	MyCalculator(int n1,int n2){
		num1 = n1;
		num2 = n2;
	}
		
	int add(){
		System.out.println("Enter two number for Addition :");
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		return num1+num2;
	}
	
	int sub(){	
		System.out.println("Enter two number for substraction :");
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		return num1-num2;
	}
	
	int mul(){
		System.out.println("Enter two number for multiplication :");
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		return num1*num2;
	}

public static void main(String [] args){
	MyCalculator c1 = new MyCalculator(2,3);
	
	Scanner scn = new Scanner(System.in);
	System.out.println("_____****ENTER YOUR CHOICE****_____");
	while(true){
		System.out.print("Press 1 for ADDITION \n Press 2 for SUBSTRACTION \nPress 3 for MULTIPLICATION \nPress 0 for exit \n");
		int c = scn.nextInt();
		
		if(c == 0){
			break;
		}
		
		if(c == 1){
			System.out.println("Addition = "+c1.add());
		}
		
		if(c == 2){
			System.out.println("Substraction = "+c1.sub());
		}
		
		if(c == 3){
			System.out.println("Multiplication = "+c1.mul());
		}
	
	}	
	}	

}