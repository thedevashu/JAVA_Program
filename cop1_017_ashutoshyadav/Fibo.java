//Write a Java Program  Print the fibonnacci series as follows: -  
//    0	1	1	2	3	5	8	13
import java.util.Scanner;

public class Fibo{
	public static void main(String [] args){
		
		int num,t1=0,t2=1,temp;
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		
		for(int i = 1 ; i < num ;i++){
			temp = t1 + t2;
			System.out.print("\t" + temp);
			t1 = t2;
			t2 = temp;
			
			
		}
	}	
}