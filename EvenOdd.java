 //Write a Java program to enter a number and print whether it is even or odd.
import java.util.Scanner;

public class EvenOdd
{
	public static void main(String []args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = scn.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println(num + "Is even ");	
		}
	
		else
		{
				System.out.println(num + "Is odd ");	
		}
		
		
	}
}