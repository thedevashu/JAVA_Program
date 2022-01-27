// Write a program in Java to print character and its ASCII value.
public class AsciiValue{

	public static void main(String [] args){
		char ch = 0;
		for( int i =0; i<=255 ;i++){
			i = (int)ch;
			ch++;
			System.out.print("\t"+i +"\t" + ch +"\t");
		}
	}	
}