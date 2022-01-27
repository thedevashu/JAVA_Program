
public class DateOfBirth {
	
	int dd;
	int mm;
	int yyyy;
	
	DateOfBirth (int d,int m,int y){
		dd=d;
		mm =m;
		yyyy=y;
		
	}
	
	public String toString() {
		String str = dd + "/"+mm +"/"+yyyy;
		return str;
	}

}
