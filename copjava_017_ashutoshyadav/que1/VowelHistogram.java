
public class VowelHistogram {
	String str="";
	char a[] ;
	char e[] ;
	char ic[] ;
	char o[] ;
	char u[] ;
	int ac =0,ec=0,icc=0,oc=0,uc=0;

	VowelHistogram(String str) {
		this.str =str;
		a = str.toCharArray();
		e = str.toCharArray();
		ic = str.toCharArray();
		o = str.toCharArray();
		u = str.toCharArray();
	}


	public void traceString() {

		//al=1;el=1;icl=1;ol=1;ul=1;
		for (int i = 0; i < str.length(); i++) {


			if(a[i] == 'a' || a[i]=='A') {
				a[ac] = 'a';
				ac++;
			}

			

		}
		
		for (int i = 0; i < str.length(); i++) {
			if(e[i] == 'e' || e[i]=='E') {
				e[ec] ='e';
				ec++;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(ic[i] == 'i' || ic[i]=='I') {
				ic[icc] ='i';
				icc++;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			
			if(o[i] == 'o' || o[i]=='O') {
				o[oc] ='o';
				oc++;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(u[i] == 'u' || u[i]=='U') {
				u[uc] ='u';
				uc++;
			}
		}
		


	}

	public void printHisto() {
		System.out.println("---------------------------------------------");
		System.out.print("a: ");
		{
			for(int j =0 ;j<ac;j++) {
				System.out.print(a[j]);
			}System.out.println("");
		}
		
		System.out.print("e: ");
		{
			for(int j =0 ;j<ec;j++) {
				System.out.print(e[j]);
			}System.out.println("");
		}
		System.out.print("i: ");
		{
			for(int j =0 ;j<icc;j++) {
				System.out.print(ic[j]);
			}System.out.println("");
		}
		System.out.print("o: ");

		{
			for(int j =0 ;j<oc;j++) {
				System.out.print(o[j]);
			}System.out.println("");
		}
		
		System.out.print("u: ");
		{
			for(int j =0 ;j<uc;j++) {
				System.out.print(u[j]);
			}System.out.println("");
		}

	}


}
