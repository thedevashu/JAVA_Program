//Write a Java program to enter a number and print whether it is positive or negative.

import java.util.Scanner;

public class Sign
{
	public static void main(String [] args){
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter the number");

	int num = scn.nextInt();
	if(num < 0 )
	{
		System.out.println(num + " is -ve");
	}
}
}