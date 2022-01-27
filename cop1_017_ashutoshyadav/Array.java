//Write a program to sccept array of 5 elements and print it details
import java.util.Scanner;
class arr_fun{
	
	int arr[] = new int[5];
	
	void read_show(){
		
		System.out.println("Enter Array elemnts : ");
		Scanner scn =new Scanner(System.in);
		for(int i = 0; i< 5;i++)
		{
			arr[i] = scn.nextInt();
		}

		for(int i = 0; i< 5;i++)
		{
			System.out.println("Array elemnt at " + (1+i) + " is : " + arr[i]);
		}
	}
	
	void Add_ele(){
		int sum = 0;
		for(int i = 0; i<5; i++)
		{
			sum = sum +arr[i];
		}
		System.out.println(" Sum = " + sum);
	}
}

public class Array{
	
	public static void main(String [] args){
		
		arr_fun arr = new arr_fun();
	
		arr.read_show();
		arr.Add_ele();
		
		
	}
}