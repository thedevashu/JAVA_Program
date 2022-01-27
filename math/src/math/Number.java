package math;

public class Number {
	private int num;
	Number(){
		this.num =0;
	}
	Number(int num){
		this.num =num;
	}
	
	
	public void setNum(int n) {
		this.num =n;
	}
	public int getNum() {
		return this.num;
	}
	
	
	
	public String toString() {
		String str = "Num :" + num;
		return str;
	}
}
