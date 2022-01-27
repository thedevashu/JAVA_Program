/*In the class that you wrote yesterday for Array functionalities add below functions to it.
1. sort the array
2. left_rotate
3. right_rotate
4 . insert_arr
5. delete_array*/
public class ArrayFun {
	private int arr[];

	public int[] getArr() {
		return arr;
	}

	public void setArr(int arr[]) {
		this.arr = arr;
	}
	
	public void intertArr(int num,int pos) {
		int i;
		for(i =arr.length-1;i>pos-1;i--) {
			arr[i] =arr[i-1];
		}
		arr[i] =num;
	}
	
	public void left_rotate() {
		int temp =arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1] =arr[i];
			
		}
		arr[arr.length-1] =temp;
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j] +" ");
		}
	}
	
	public void right_rotate() {

		int temp =arr[arr.length-1];
		for(int i =arr.length-1;i>0;i--) {
			arr[i] =arr[i-1];
		}
		arr[0]=temp;
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j] +" ");
		}
	
	}
	
	public void sortArr() {
		int i,j,temp;
		for(i =0;i<arr.length;i++) {
			for(j=i;j<arr.length;j++) {
				
				
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j] =temp;
					
				}
				
			}
			System.out.print(" "+arr[i]);
		}
		
	}

}
