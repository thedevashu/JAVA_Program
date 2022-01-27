//Write a Java program to accept a number from user and find sum of its digits.
   //Example if input is 123 output is 6  (means 1+2+3)

import java.util.Scanner;


public class DigitSum{
	
public static void main(String [] args){
	
	Scanner scn =new Scanner(System.in);

	System.out.print("Enter the number : ");
	int num = scn.nextInt();
	int temp,rem,sum =0;
	while(num != 0 ){
		temp = num%10;
		sum =sum + temp;
		num= num/10;		
	}

	System.out.print("Sum of digit is: " + sum);
	}
}