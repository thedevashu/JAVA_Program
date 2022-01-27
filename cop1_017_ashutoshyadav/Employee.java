//Ass 1 Que2
import java.util.Scanner;
 
public class Employee 
{
 
 	int empid;
 	String name;
 	String gender;
 
 public void getInput() 
	{
 
  	Scanner in = new Scanner(System.in);
  	System.out.print("Enter the empid : ");
  	empid = in.nextInt();
  	System.out.print("Enter the name : ");
  	name = in.next();
  	System.out.print("Enter the gender : ");
  	gender = in.next();
 	}
 
 public void display() 
	{
  
  	System.out.println("Employee id = " + empid);
  	System.out.println("Employee name = " + name);
  	System.out.println("Employee gender = " + gender);
	}
 
public static void main(String[] args) 
	{
 
	Employee e[] = new Employee[5];
  
  	for(int i=0; i<5; i++) 
	{
   
   	e[i] = new Employee();
   	e[i].getInput();
	}
  
System.out.println(" Data Entered as below ");
  
	for(int i=0; i<5; i++) 
	{
   
	e[i].display();
	}
	}
}













/*Create a class Employee having member empId(int), empName(String),gender(char)
1.Write parameter less constructor and initialize your variables.
2.Write display function which display the data.
Also write TestMain class in the same file  which will create the object of class Employee in it and call the display() Function.
*/

/*
import java.util.Scanner;

class emp{
	int empId;
	String empName;
	char gender;

	
	void empId(int Id){
		empId = Id;
		//System.out.println("Name : " + empName + " ID : " + empId + " Gender " + gender );
	}
	void empName(String name){
		empName = name;
		//System.out.println("Name : " + empName + " ID : " + empId + " Gender " + gender );
	}
	void empGen(char gen){
		gender= gen;
		//System.out.println("Name : " + empName + " ID : " + empId + " Gender " + gender );
	}
	
	void display(){
		System.out.println("Name : " + empName + " ID : " + empId + " Gender " + gender );
	}
	
	
			
};
	
public class Employee{
	
	public static void main(String [] args){
	
	emp emp1 =  new emp();
	emp1.empName("BOB");	
	emp1.empGen('F');
	
	emp1.empId(2929);

	emp1.display();
	
	}
}
*/