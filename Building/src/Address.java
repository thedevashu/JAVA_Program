/*Q1.Write a class Address having attributes String flatNo,bldName,area,city,state,country,pincode.
Write a no-args and parameterized constructor.
Display everything using toString() and return it as a string.
Write a MainAddress class in that write main method to create an Address class object ,
using parameterized constructor and show details.*/
public class Address {
	String flatNo,bldName,area,city,state,country,pincode;
	
	Address(String fn, String bn,String ar,String c,String s,String cy,String pin) {
		this.flatNo =fn;
		this.bldName = bn;
		this.area =ar;
		this.city =c;
		this.state =s;
		this.country =cy;
		this.pincode =pin;
		
	} 
	
	public String toString() {
		String str ="Flat no:" + this.flatNo + " Building name: "+ this.bldName;
		str=str+" area: " + this.area + "\nCity: " + this.city + "State: " + this.state;
		str =str+"Counter: " + this.country+"Pincode: "+ this.pincode;
		return str;
	}
}
