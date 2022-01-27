package ARRAY;
/*Create array_class to implement below operations on integer array with 10 elements.
1.Copy one array to other.
2.concatenate two arrays.
3.Reverse the array*/


public class ArrayClass {
	
	public void  copyarr(int []arr, int []brr) {
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
	}

	public void concat(int arr[],int brr[],int []crr) {
		for(int i=0;i<arr.length ;i++) {
			crr[i]=arr[i];
			crr[i+10]=brr[i];
		}
	}
	public void revArr(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int temp =arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
}
