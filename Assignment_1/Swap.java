//Swap two numbers without using a third variable.

import java.util.Scanner;
public class Swap{
	
	void swap_num(int a,int b){
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap num1 =" + a + " num2 =" + b );
	}
	
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Enter num1: ");
		num1 =scn.nextInt();

		System.out.println("Enter num2: ");
		num2 =scn.nextInt();
		
		System.out.println("Before Swap num1 =" + num1 + "num2 =" + num2);
		System.out.println("----------------------------------------------------------");
		
		Swap s1 = new Swap();
		s1.swap_num(num1,num2);
	}
}