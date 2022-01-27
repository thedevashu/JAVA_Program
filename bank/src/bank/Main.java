package bank;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankData.accountNo = 100;
		//BankData user = new BankData();

		Transctions ts = new Transctions();

		Scanner inp = new Scanner(System.in);
		int choice=0;
		boolean b =true;
		while(b) {
			System.out.println("Enter 1 for Inserting Data.\nEnter 2 for Deposite Amount.\nEnter 3 for Withdraw amount.\nEnter 4 to check Balance.\nEnter 5 to display all Detials.\nEnter 0 for Exit...");
			choice =inp.nextInt();
			switch (choice) {
			case 1:
				ts.insertData();
				break;
			
			case 2:
				ts.deposit();
				break;
				
			case 3:
				ts.withdraw();
				break;
				
			case 4:
				System.out.println("<--------------------------->\n");
				ts.checkBalance();
				System.out.println("<--------------------------->\n");
				break;
				
			case 5:
				System.out.println("<--------------------------->\n");
				ts.displayDetials();
				System.out.println("<--------------------------->\n");
				break;
				
			case 0:
				b=false;
				break;
			}
		}
		//		ts.insertData();
		//		ts.displayDetials();
		//		ts.deposit();
		//		ts.displayDetials();


	}


}
