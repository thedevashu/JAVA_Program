package area;

import java.util.Scanner;

/*Q2.Create a CalArea which finds area of circle,rectangle and triangle.Write 3 static menthods to calulate the area 
and create class TestMain call all the area methods*/

public class CalArea {
	static int rad;
	static int l,h;
	static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("ENTER CHOICE");
			System.out.println("1. FOR AREA OF CIRCLE\n2. FOR AREA OF RECTANGLE\n3. AREA OF TRIANGLE");
			int key =scn.nextInt();
			if(key == 0) {
				System.out.println("QUIT");
				break;
			}
			switch (key) {
			case 1:{
				cirArea();
				break;
			}
			case 2:{
				recArea();
				break;
			}
			case 3:{
				triArea();
				break;
			}

			default:
				break;
			}
			
		}

	}
	private static void triArea() {
		System.out.println("ENTER BASE AND HEIGHT OF TRIANGLE");
		l=scn.nextInt();
		h=scn.nextInt();
		float area = (float)(0.5*l*h);
		System.out.println("AREA OF TRIANGLE=" + area);
	}
	private static void recArea() {
		System.out.println("ENTER LENGTH AND BREATH OF RECTANGLE");
		l=scn.nextInt();
		h=scn.nextInt();
		float area = (float)(l*h);
		System.out.println("AREA OF RECTANGLE=" + area);
		
	}
	private static void cirArea() {
		System.out.println("ENTER RADII CIRCLE");
		rad=scn.nextInt();
		float area = (float)(3.142*(rad*rad));
		System.out.println("AREA OF CIRCLE=" + area);
		
	}
	

}
