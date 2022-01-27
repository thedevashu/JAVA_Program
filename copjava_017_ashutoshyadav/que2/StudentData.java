/*Write a program to demonstrate user input and output of student structure having four attribute namely name,
age, roll_no, gender:
	
Function:
a). Print name of all female student.
b). Print name of all male student.
c). Print highest rollno student name.
d). Print most elder student name.
e). Print most youngest student name.
f). Print ratio of student gender*/
public class StudentData {
	private String name ;
	private int age;
	private int roll;
	private char gender;
	
	StudentData(String nm,int a,int r,char g){
		this.setName(nm);
		this.setAge(a);
		this.setRoll(r);
		this.setGender(g);
	}

	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		String str ="Name:" +this.name +" Roll no.: " + this.roll + " Age :"+ this.age + " Gender :"+ this.gender;
		return str;
	}
	
}
