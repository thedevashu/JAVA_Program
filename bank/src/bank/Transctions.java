package bank;

import java.util.Scanner;

public class Transctions {
	BankData user;
	String name;
	int balance;
	Scanner scn =new Scanner(System.in);
	
	
	public void insertData() {
		user =new BankData();
		System.out.println("Enter Name of Account Holder:");
		name = scn.nextLine();
		user.setName(name);
		
		System.out.println("Enter Your balance:");
		balance =scn.nextInt();
		user.setBalance(balance);
			
	}
	public void deposit() {
		
		System.out.println("Enter Deposite amount:" + balance);
		int amt =scn.nextInt();
		balance = balance +amt;
		user.setBalance(balance);
	}
	
	public void withdraw() {
		System.out.println("Enter Withdrawl amount: "+balance);
		int amt =scn.nextInt();
		balance = balance-amt;
		user.setBalance(balance);
	}
	
	public void checkBalance() {
		
		System.out.println("Avail balance is :"+ user.getBalance());
	}
	
	
	
	public void displayDetials() {
		
		System.out.println(user);
		
	}

}
