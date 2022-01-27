//Write a program that converts kilometers per hour to miles per hour.
 //    miles = (kilometer  * 0.6213712)

import java.util.Scanner;
public class MileConversion{

	public static void main(String[] args) {
		Double kmph,mph;
		Scanner scn = new Scanner(System.in);
		System.out.println("ENter speed in km/hour ");
		kmph = scn.nextDouble();

		mph = kmph * 0.6213712;

		System.out.println(mph);


	}
}