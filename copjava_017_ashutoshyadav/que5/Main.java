package uperrcase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter your string :");
		String s =scn.nextLine();
		int temp=0;
		char crr[] = s.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			temp =i;
			if(crr[i] == ' ' && crr[temp+1] != ' ') {
				
				crr[temp+1]-=32;
				
			}
			
		}
		String str =String.valueOf(crr);
		System.out.println(str);
	}

}
