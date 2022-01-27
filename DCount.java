import java.util.Scanner;

public class DCount{
	
public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scn.next();

		int count =0;
		for(int i= 0; i< str.length();i++)
		{
			if(str.charAt(i) == 'd')
			{
				count++;
			}
		}
		System.out.println("Number of D's are :  " + count);	
	}
}