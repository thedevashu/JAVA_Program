/*Write a Java Program to Create an array and write a function to reverse the array.*/

import java.util.Scanner;

class ArrayOp{
		
		
		
	ArrayOp(){
		
	}

	Scanner scn = new Scanner(System.in);
	void readArr(int []arr){

		

		System.out.println("Enter Array" + arr.length +" element of Array"  );	
		for (int i =0; i< arr.length; i++) {
			arr[i] = scn.nextInt();
		}

	}

	void revDisplay(int []arr){
		
		for (int i = (arr.length -1);i >= 0;i-- ) {
			System.out.println(arr[i]);
		}
	}
}

public class RevArray{

	public static void main(String[] args) {

		int size ;
		
		System.out.println("ENter Size of Array");
		Scanner scn = new Scanner(System.in);
		size= scn.nextInt();
		int arr[] = new int[size];

		ArrayOp a = new ArrayOp();
		a.readArr(arr);
		a.revDisplay(arr);
	}
}