import java.util.Scanner;

public class MyName
{
	public static void main(String args[])
	{
		System.out.print("Enter name" );
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		System.out.print("Hello " + name);
	}
}