/*1). 
 *
 **
 ***
 ****

2). 
1
22
333
4444
333
22
1

3). 
1,2,3,4....98,99,100,99,98,....3,2,1

4). 
Stack of int

5).
Stack of Students
 */
public class Pattern {
	static int num1=0,num2=1,sum;
	public static void main(String[] args) {
		oneTwo(1,5);
//		star(1,5);
//		numberP(1,5);
//		fibo(30);
//		numS(1,10);
//		fun(1);
	}
	
	
	
	public static void numS(int i,int n) {
		
		if(i<n) {
			System.out.print(i+",");
			numS(i+1,n);
			i=i-1;
			if(i!=0)
			System.out.print(i+",");
		}
	}
	
	public static void fibo(int n) {
		
		if(n>0) {
			sum=num1+num2;
			System.out.print(sum+" ");
			num1 =num2;
			num2=sum;
			fibo(n-1);
		}
	}
	
	public static void  numberP(int i, int n) {
		for(int j=0;j<i;j++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		if(i<n) {
			numberP(i+1,n);
		}
		for(int j=0;j<i-1;j++) {
			System.out.print(i-1 + " ");
		}
		System.out.println("");
	}

	public static void star(int i ,int n) {

		for(int j=1;j<i;j++) {
			System.out.print(" * ");
		}
		System.out.println("");
		if(i<n) {
			star(i+1,n);
		}
		for(int j=1-1;j<i;j++) {
			System.out.print(" * ");
		}
		System.out.println("");
	}
	public static void fun(int i) {

		if(i<10) {
			System.out.print(i);
			fun(i+1);
			System.out.print(i);
		}

	}
	
	public static void oneTwo(int i ,int n) {

		for(int j=0;j<i;j++) {
			if(j%2==0)
			System.out.print(" 1 ");
			else
				System.out.print(" 2 ");
		}
		System.out.println("");
		if(i<n) {
			oneTwo(i+2,n);
		}
		for(int j=0;j<i-2;j++) {
			if(j%2==0)
			System.out.print(" 1 ");
			else
				System.out.print(" 2 ");
		}
		System.out.println("");
	}
}
