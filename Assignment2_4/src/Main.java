import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter size of array:");
		size =scn.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter array elements");
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =scn.nextInt();
		}
		MinMax m =new MinMax(arr);
		boolean b=true;
		while(b) {
			System.out.println("Enter 1 to see min\nEnter 2 to see max\nEnter 3 to see sum");
			int ch =scn.nextInt();
			switch(ch) {
			case 1:
				System.out.println(m.min());
				break;
			case 2:
				System.out.println(m.max());
				break;
			case 3:
				System.out.println(m.sum());
				break;
			default:
				b=false;
			}
		}
		
	}

}
