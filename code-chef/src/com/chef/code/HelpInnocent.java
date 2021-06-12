package com.chef.code;

import java.util.Scanner;

public class HelpInnocent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		char[] ch = new char[8];
		
		ch = name.toCharArray();
		
		
		int val1 = ch[0] + ch[1];
		
		int val2 = ch[3] + ch[4];
		
		int val3 = ch[4] + ch[5];
		
		int val4 = ch[7] + ch[8];
		
		
		if(ch[2] != 'A' && ch[2] != 'E' && ch[2] != 'I' && ch[2] != 'O' && ch[2] != 'U'  
			&& ch[2] != 'Y') 
		{
			
			int val = val1+val2+val3+val4; 
			
			if((val1%2 == 0) && val2 %2 == 0 && val3 %2 == 0 && val4 %2 == 0) {
			
				System.out.println("valid");
			}
			
			else {
				System.out.println("invalid");
			}
			
			
			
			
		}
		
		else {
			System.out.println("invalid");
		}

	}

}
