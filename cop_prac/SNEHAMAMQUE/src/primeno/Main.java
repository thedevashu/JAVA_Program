package primeno;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		armstrong();
		//primeno();
}

	private static void armstrong() {
		int num,rem,i,noDigit=0;
		double sum=0;
		for(i=0;i<=100000;i++) {
			num=i;
			int powc=i;
			int temp=num;
			while(powc > 0) {
				powc=powc/10;
				noDigit++;
			}
			
			while(num>0) {
				rem = num%10;
				num=num/10;
				sum=sum+Math.pow(rem, noDigit);
				
			}
			noDigit=0;
			if(sum == temp) {
				System.out.print(temp+",");
			}
			sum=0;
		}
		
	}

	private static void primeno() {
		int j;
		int i=j=0;
		for(i=1;i<1000;i++) {
			for(j=2;j<i;j++) {
				if(i%j == 0) 
					break;
			}
			if(i==j) {
				System.out.print(i+",");
			}
		}
	}

}
