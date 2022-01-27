package bank;

public class BankData {
	static int accountNo;
	private String name;
	private int balance;
	
	BankData( ){
		this.name = getName();
		this.balance =getBalance();
		accountNo++;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public String toString() {
		String str = "Account no: "+accountNo +"\n Name of account holder:" + this.name+"\n Balance : "+ balance;
		return str;
	}

	
	
}
