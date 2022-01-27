package circle;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		System.out.println(x +"in get x");
		return x;
	}
	
	public int getY() {
		// TODO Auto-generated method stub
		System.out.println(y+"in get y");
		return y;
	}
	public void setX(int ax) {
		x=ax;
		//System.out.println(x+"in set y");
	}
	
	
	public void setY(int ay) {
		y=ay;
		System.out.println(y+"in set y");
	}
	
	
	

	
	public Point(int ax,int ay) {
		x= ax;
		y =ay;
	}
	
	
	public String toString() {
		String str = "(" + x +", "+ y + ")";
		return str;
	}
}
