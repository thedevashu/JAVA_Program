package employee;

public class Address {

	private String street_Name;
	private String Building_name;
	private int pincode;
	public Address(String street_Name, String Building_name, int pincode) {
		this.street_Name = street_Name;
		this.Building_name = Building_name;
		this.pincode = pincode;
	}
	public String getStreet_Name() {
		return street_Name;
	}
	public void setStreet_Name(String street_Name) {
		this.street_Name = street_Name;
	}
	public String getBuilding_name() {
		return Building_name;
	}
	public void setBuilding_name(String building_name) {
		Building_name = building_name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String toString() {
		String str =street_Name+","+Building_name+","+pincode;
		return str;
	}
}
