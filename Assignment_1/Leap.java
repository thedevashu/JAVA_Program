import java.util.Scanner;

public class Leap{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Year");
		int yr =scn.nextInt();

		if(yr % 400 ==0 || yr % 100==0){
			System.out.println(yr +"Leap year");
		}

		else
			System.out.println(yr + "not Leap year");
	}
}