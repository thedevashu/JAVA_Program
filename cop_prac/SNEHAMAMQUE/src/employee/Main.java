package employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter no of employee");
		int noOfemp=scn.nextInt();
		Employee emp[] =new Employee[noOfemp];
		populateEmp(emp,scn);
		
		highSalEmp(emp);
		System.out.println("Enter empId to increase salary of emp by 20%:");
		int id=scn.nextInt();
		updateSal(id,emp);
		display(emp);

	}

	private static void updateSal(int id, Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			if(id == emp[i].getEmpId()) {
				float prevsal=emp[i].getSalary();
				emp[i].setSalary((float) (prevsal + 0.2*prevsal));
			}
		}
		
	}

	private static void highSalEmp(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			if(emp[i].getSalary() >= 5000) {
				System.out.println(emp[i]);
			}
		}
		
	}

	private static void display(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
	}

	private static void populateEmp(Employee[] emp, Scanner scn) {
		
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter Employe id,name,salary");
			int id=scn.nextInt();
			String nm=scn.next();
			float sal=scn.nextFloat();
			System.out.println("ENTER ADDRESS street,building,pin ocde");
			String street=scn.next();
			String build =scn.next();
			int pin =scn.nextInt();
			Address ad =new Address(street,build,pin);
			emp[i]=new Employee(id,nm,sal,ad);
		}
		
	}

}
