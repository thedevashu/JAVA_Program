/*Write a class MinMax in that write main method create an int[] 
 * of size given by user.
Accept the integers from user and store it in array.
write a loop to generate menu driven program to 
show a menu
		1. show the minimum value in array
		2. show the maximum value in array
		3. show any Sum of array elements in array	
		4. quit
*/
public class MinMax {
	int arr[];
	MinMax(int [] arr){
		this.arr =arr;
	}
	public int min() {
		int min=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[0]>arr[i]) {
				min =arr[i];
			}
			else
				min=arr[0];
				
		}
		return min;
	}
	
	public int max() {
		int max=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[0]<arr[i]) {
				max =arr[i];
			}
		}
		return max;
	}
	public int sum() {
		int sum=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[0]<arr[i]) {
				sum +=arr[i];
			}
		}
		return sum;
	}
	
}
	



