package assignment2_3;
/*Write a class MathUtil
	write 3 static methods
Write a menu driven program to do below functionalites.
	1. getSquare --accept number as argument and return square
	2. getFactorial--accept number as argument and return factorial
	3. isPrime--accept num as arg and return true if number is prime else return false.
call all the three in methods in main() method.*/
public class Math {
	public static double getSquare(int num) {
		return num*num;	
	}
	
	public static double getFactoria(int num) {
		double sum=1;
		for(int i =1;i<=num;i++)
		{
			sum=sum*i;
		}
		
		return sum;
		
	}
	
	public static boolean isPrime(int num) {
		int i;
		for( i =2;i<=num ;i++) {
			if(num%i==0) {
				break;
			}
		}
		if(num == i ) {
			return true;
		}
		else
			return false;
	}

}
