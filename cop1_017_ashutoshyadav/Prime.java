// Display all prime number between 1 to 100.

public class Prime{

	public static void main(String args[]){
		int j;
		for(int i= 1;i<=100;i++){
			for(j =2 ; j<=i;j++){
				if(i%j == 0){
				break;
				}
			}
			if(j==i){
				System.out.println(j + " is prime number");
			}
		}
	}
}