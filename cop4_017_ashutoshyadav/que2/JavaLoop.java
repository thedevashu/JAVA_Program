/*.Write a JavaLoops class to have all static methods to do below operations using loop
 1.program to print x raised to the power y, where x and y are positive integers and taken from the user.(hint->For example if x=3 and y=4 then ouput is 3*3*3*3=81)
 2. Print the fibonnacci series as follows: -  
    0	1	1	2	3	5	8	13�.n  
3. Display 1 to n prime numbers. take input n from user*/
public class JavaLoop {
	public static long power(int x,int y) {
		int po=x;
		for(int i=0;i<=y;i++) {
			 po*=x;
		}
		System.out.println(" power:" + po);
		return 0;
	}
	
	public static void fibo(int n) {
		int num1 =0,num2=1;
		int temp=0;
		for(int i =0; i<=n;i++) {
			
			System.out.print("_"+num1);//8
			temp =num1;					//8
			num1=num1+num2;				//13
			num2=temp;					//8
			
		}
		System.out.println("");
	}
	
	public static void prime(int n) {
		int i,j;
		for(i=2;i<=n;i++) {
			for(j =2;j<=i;j++) {
				if(i%j == 0) {
					break;
				}
				
				}
			if(i==j) {
				System.out.print(" ,"+ i);
			}
		}
	}
	
}
