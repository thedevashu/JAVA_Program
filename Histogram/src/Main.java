import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		String in =scn.nextLine();
		
		VowelHistogram v1 = new VowelHistogram(in);
		v1.traceString();
		v1.printHisto();
	}

}
