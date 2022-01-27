
public class Student {
	
	  private String name;
	  private int age;
	  private int [] mark ;
	  
	  public Student(String s ,int a, int [] m) {
		  name = s;
		  age =a;
		  mark =m;
	  }
	  
	  public Student(String s ,int a) {
		  name = s;
		  age =a;
		  mark = new int[1];
		  mark[0] =2;
	  }

	public String toString() {
		String str = "Name :" + name + " Age :"+ age +" MArks"+ getMarkStr();
		return str;
		
	}
	public void setMarks(int [] m) {
		mark =m;
	}
	
	public String getMarkStr() {
		String str ="{";
		for (int i =0 ;i<mark.length;i++)
		{
			str = str + mark[i] + ", ";
		}
		return str = str +"}";
		
	}
	
	
}
