import java.util.Scanner;

public class Main {
	
		
	
	public static void main(String[] args) {
		
		int noOfStudent ;
		StudentData [] s;
		Scanner scn = new Scanner(System.in);
		
		
		StudentFunction f =new StudentFunction();
		int loop =f.noOfStudent();
		
		for(int i=0; i< loop;i++) {
			f.read(i);
			
			
		}
		f.girl();
		f.boy();
		
		System.out.println(f.eldest());
		System.out.println(f.youngest());
		
		System.out.println(f.ratioOfGender());
		
		
		
		
	}
}
