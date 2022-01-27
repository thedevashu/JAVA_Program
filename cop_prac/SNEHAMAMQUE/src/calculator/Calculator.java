package calculator;

/*Q1.create a class Calculator and create main() and then Write Menu Driven program in Java to do below operations.
1.ADD      (write all static functions )
2.Subtract
3.Multiply
4.Divide.
*/

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {

	Scanner scn =new Scanner(System.in);
	System.out.println("-------WEL-COME---------");
	while(true) {
		System.out.println("ENTER CHOICE!!\n1.ADD \n" + 
				"2.Subtract\r\n" + 
				"3.Multiply\r\n" + 
				"4.Divide\r\n" +
				"0. EXIT");
		int optn = scn.nextInt();
		
		if(optn == 0) {
			System.out.println("YOU QUIT");
			break;
		}
		if(optn >4) {
			System.out.println("wrong entry try again");
			continue;
		}
		System.out.println("ENTER TWO NUMBER");
		int num1=scn.nextInt();
		int num2 =scn.nextInt();
		switch (optn) {
		case 1:{
			add(num1,num2);
			break;
		}
		case 2:{
			sub(num1,num2);
			break;
		}
		case 3:{
			mul(num1,num2);
			break;
		}
		case 4:{
			div(num1,num2);
			break;
		}

		default:
			System.out.println("RETRY! WRONG ENTRY");
			break;
		}
		
	}
}

private static void div(int num1, int num2) {
	System.out.println(num1 + "/"+ num2 + "="+ num1/num2);
	
}

private static void mul(int num1, int num2) {
	System.out.println(num1 + "*"+ num2 + "="+ num1*num2);
	
}

private static void sub(int num1, int num2) {
	System.out.println(num1 + "-"+ num2 + "="+ (num1-num2));
	
}

private static void add(int num1, int num2) {
	System.out.println(num1 + "+"+ num2 + "="+ (int)(num1+num2));
	
}


}
