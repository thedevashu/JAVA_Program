package assignment2_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,choice;
		Scanner scn =new Scanner(System.in);
		boolean b=true;
		while(b) {
			System.out.println("Enter 1 for prime_no\nEnter 2 for Factorial\nEnter 3 for Square:");
			choice =scn.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Enter num for operation: ");
				num =scn.nextInt();
				System.out.println("Is prime?\n"+Math.isPrime(num));
				break;
			case 2:
				System.out.println("Enter num for operation: ");
				num =scn.nextInt();
				System.out.println("Factorial\n: "+Math.getFactoria(num));
				break;
			case 3:
				System.out.println("Enter num for operation: ");
				num =scn.nextInt();
				System.out.println("Square\n"+Math.getSquare(num));
				break;
			default:
				b=false;
			}
			
		}
	}

}
