import java.util.Scanner;


public class StudentFunction {
	    String name ="";
		int age;
		int roll;
		char g;
		Scanner scn = new Scanner(System.in);
		StudentData [] s;
		int size;
		
	public void read(int i) {
		
		System.out.println("Enter name:");
		name = scn.next();
		System.out.println("Enter age");
		age =scn.nextInt();
		System.out.println("Enter Roll no.");
		roll =scn.nextInt();
		System.out.println("Enter gender F/M");
		g=scn.next().charAt(0);
		s[i] = new StudentData(name, age, roll, g);
		
	}
	public void girl() {
		System.out.println("----Female_Student----");
		for(int i =0;i<size;i++) {
			if(s[i].getGender() == 'f'|| (s[i].getGender() == 'F')) {
				System.out.println(s[i]);
			}
		}
	}
	
	public void boy() {
		System.out.println("----Male_Student----");
		for(int i =0;i<size;i++) {
			if(s[i].getGender() == 'm' ||(s[i].getGender() == 'M')) {
				System.out.println(s[i]);
			}
		}
	}
	
	public int eldest() {
		
		int arr[]= new int[size]; 
		for(int i =0;(i<size);i++) {
			arr[i]=s[i].getAge();
		}	
		for (int i = 0; i < arr.length; i++) {
			if(arr[0]<arr[i]) {
				arr[0] =arr[i];
			}
		}
		System.out.println("----Eldest_Student----");
		return arr[0];
		
	}
	
	
public int youngest() {
		
		int arr[]= new int[size]; 
		for(int i =0;(i<size);i++) {
			arr[i]=s[i].getAge();
		}	
		for (int i = 0; i < arr.length; i++) {
			if(arr[0]>arr[i]) {
				arr[0] =arr[i];
			}
		}
		System.out.println("----Youngest_Student----");
		return arr[0];
		
	}

public float ratioOfGender() {
	int b=0;
	int g=0;
	for(int i=0;i<size;i++) {
		if(s[i].getGender() == 'M') {
			b++;
		}
		else if(s[i].getGender() == 'F') {
			g++;
		}
		
	}
	return (float)b/ (float)g;
	
}
	

	public int noOfStudent() {
		System.out.println("Enter no of student");
		size =scn.nextInt();
		s= new StudentData[size];
		return size;
		
	}
}
