//. Accept input from the user and check whether the input is number or character or symbol.

import java.util.Scanner;

public class CharCheck{
	public static void main(String [] args){
		char ch;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Char : " );
		ch = scn.next().charAt(0);
		int ascii = (int)ch; 
		
		if(ascii >47 && ascii < 58){
			System.out.println("Input is number ");
		} 
		else if(ascii >=65 && ascii <= 90 || ascii>=97 && ascii <=122)
			System.out.println("Input is Character ");
		else
			System.out.println("Input is Symbol ");
	}
}