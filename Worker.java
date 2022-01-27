import java.util.Scanner;



public class Worker{
	String name;
	int id;
	char gen;
public void getInput(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name of worker: ");
		String name  = scn.next();

		System.out.println("Enter id of worker: ");
		int id  = scn.nextInt();

		System.out.println("Enter grnder of worker: ");
		char gen  = scn.next().charAt(0);
		
	}
	
	public void display(){
		System.out.println(name + " id " + id + "Gender : " + gen);
	}

	public static void main(String [] args){
		
		
		Worker w[] = new Worker[5];
		for(int i = 0; i<5 ; i++){		
		w[i] = new Worker();
		w[i].getInput();
		}
		
		for(int i = 0; i<5 ; i++){		
		//w[i] = new Worker()
		w[i].display();
		}
}
}