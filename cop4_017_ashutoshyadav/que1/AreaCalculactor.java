/*Create a class AreaCalculate to write data members
as final pi=3.14 ,radius now 
write two functions in class AreaCalculate area() and circumference()
Now create Main class in that write main() method
 to create object of AreaCalculate class and call
area() function and circumference() function*/
public class AreaCalculactor {
	
	final float pi= 3.14f;
	private float rad;
	
	
	public void area(float r) {
		this.rad =r;
		System.out.println("Area of Circle = " + pi *this.rad*this.rad);
	}
	public void circumference() {
		System.out.println("Circumferenc ="+ 2*pi*this.rad);
	}
}
