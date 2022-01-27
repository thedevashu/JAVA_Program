package circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int r;
		int p1,p2;
		
		
		
		Circle c1 =new Circle(2);
		System.out.println(c1);
		
		Circle c2 =new Circle(4,1,0);
		System.out.println(c2);
		
		System.out.println(c1.isIntersect(c2));
		
		
		
	}

}
