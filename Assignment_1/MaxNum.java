//Write a Java program to enter three numbers and print maximum number.

import java.util.Scanner;
	
public class MaxNum{
	
	public static void main(String [] args){


		Scanner scn = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter Three numbers :");
		
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		
		if(num1 > num2){
			if(num1>num3){
				System.out.println( num1 +" is max ");
			}
			
		}
		else if (num2>num3){
			if(num2>num1)
			System.out.println(num2 + " is max");
		}
		else System.out.println(num3 + " is max");
	}
}
