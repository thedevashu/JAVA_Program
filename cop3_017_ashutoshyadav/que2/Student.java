/*Write a class Student having following attributes
	int rollNo;
	String studentName;
	boolean isExperianced;
they should be private write a no-args and parameterized constructor.
Write two public methods
1. showStudentInfo
2. setExperienced(boolean b)*/

package student;

public class Student {
	private int rollNo;
	private String studentName;
	private boolean isExperianced;
	
	Student(int rollNo,String studentName,boolean isExperianced){
		this.setRollNo(rollNo);
		this.setStudentName(studentName);
		this.setExperianced(isExperianced);
	}
	
	public void showStudentInfo() {
		System.out.println("Roll no:" + rollNo);
		System.out.println("Name: "+ studentName);
		System.out.println("Experienced: " + isExperianced);
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean isExperianced() {
		return isExperianced;
	}

	public void setExperianced(boolean isExperianced) {
		this.isExperianced = isExperianced;
	}
}
