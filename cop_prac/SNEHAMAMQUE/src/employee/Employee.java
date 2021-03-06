package employee;
/*Create a class Employee with Members empId,name,salary,Address ad(containment) 
and create another class Address which has members 
street_Name,Building_name,pincode.Write a menu driven program to do below opertaions.
***Write getter and setter methods for both classes**
1.Display employees having salary > 5000
2.Display all details
3.Update particular employee salary by 20% depending upon empID
4.Search employee as per his employee id and display that employee
          Hint:Make use of array of objects .
*/
public class Employee {
	private int empId;
	private String name;
	private float salary;
	private Address ad;
	
	public Employee(int empId, String name, float salary, Address ad) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.ad = ad;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public String toString() {
		String str ="Emp id-"+empId+",Name: "+name+",Salary: "+salary+",Address:"+ad+" ";
		return str;
	}
	
}
