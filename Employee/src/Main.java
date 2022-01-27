import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Employee.companyName ="IET pune";
		String name;
		int id;
		int salary;
		Scanner scn =new Scanner(System.in);
		int noOfEmployee;
		String dob ="";
		Employee[] e =new Employee[5];
		System.out.println("Enter no. of Employee you want: ");
		noOfEmployee =scn.nextInt();
		e =new Employee[noOfEmployee];
		
		for (int i = 0; i < noOfEmployee; i++) {
		
			System.out.println("Enter name of employee:");
			name =scn.next();
			
			System.out.println("Enter ID of employee:");
			id =scn.nextInt();
			
			System.out.print("Enter Salary of employee:");
			salary = scn.nextInt();
			
			System.out.println("Enter DOB in DD/MM/YYYY :");
			dob =scn.next();
			String [] date = dob.split("/");
			int d =Integer.parseInt(date[0]);
			int m =Integer.parseInt(date[1]);
			int yr =Integer.parseInt(date[2]);
			
			
			 e[i] =new Employee(name,id,salary,d,m,yr);
			
			
			
		}
		
		for (int i = 0; i < noOfEmployee; i++) {
			System.out.println("-------------xxxxxxx---------------");
			
			System.out.println(e[i]);
		}

	}

}
