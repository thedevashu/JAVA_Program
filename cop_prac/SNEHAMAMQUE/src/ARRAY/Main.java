package ARRAY;

public class Main {

	public static void main(String[] args) {
		int arr[]= {1,3,2,4,5,6,7,8,9,10};
		int brr[]=new int[10];
		int crr[]=new int[20];
		ArrayClass ac =new ArrayClass();
		ac.copyarr(arr, brr);
		ac.concat(arr, brr, crr);
		ac.revArr(crr);
		printarr(crr);
		
	}

	private static void printarr(int[] brr) {
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+",");
		}
		
	}

}
