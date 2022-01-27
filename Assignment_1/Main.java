

import java.util.Scanner;



class Main
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}


class GfG
{
    void printPat(int n)
    {
         // Your code here
        int rep =n;
        int row = n;
        int i,j,k;
       // int pcount=1;
      for(k=0;k<row;k++){
      	for( i = rep; i>0 ;i--){
      		for( j=0;j<n;j++){
      			System.out.print( i + " ");
      		}
      		//rep--;
      		
      	}
      	System.out.println("");
      	rep =row;
      	n--;
      }
      	
      
    }
}