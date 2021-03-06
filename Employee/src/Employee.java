
public class Employee {
	static String companyName;
	private int id;
	private String name;
	private int salary;
	private DateOfBirth dob;
	
	
	
	public Employee(String n,int i,int s,int d,int m, int yr) {
		name =n;
		id =i;
		salary =s;
		dob =new DateOfBirth(d,m,yr);
		
	}
	public void showEmpDetails() {
		toString();
	}
	
	
	public String toString() {
		String str = "Name :"+name + " ID :"+ id+ " Salary :"+salary +"DOB :"+ dob;
		str = str + "Company :" + companyName;
		return str;
	}
	
	
}




/*COP_Assignment_2:Based on containment and array of objects
Q1.Write a class Employee having fields id, name ,salary
write no-args and parameterized constructor  and showEmpDetails  function--- show the info in the class
create another class MainEmpUser in that class In
 public static void main(String args[])
	  create an employee array of size entered by user
	  in a loop accept the employee details for each employee and create an Employee object 
	  add the object to the array after completing this---
	in another loop show details of all the employees entered in the array.

Q2.Modify the Employee class written above id, name ,salary  Date dob(date of birth), 
no-args and parameterized constructor add one more parameterized constructor with fields
   showEmpDetails --- show the info in the class
***dob is a reference of class MyDate. Write a class MainEmpUser in that write
 public static void main(String args[])
 where you  create a few employees and call showdetails  method.


*/