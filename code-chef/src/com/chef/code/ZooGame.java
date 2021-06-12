package com.chef.code;

import java.util.Arrays;
import java.util.Scanner;

public class ZooGame {
	
	public static void main(String[] args) {
		
		//input zz oooo
		//input zzzoooooo
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		int count1 = 1;
		int count2 = 0;
		
		int indexOfx = 0;
		
		char[] ch = name.toCharArray();
		
		char initx = ch[0];
		
		for(int i=1; i<ch.length; i++) {
			
			if(ch[i] == initx) {
				
				count1++;
				indexOfx = i;
				
				
			}
		}
			
			int indexofy = indexOfx+1;
			char inity = ch[indexofy];
			for(int j = indexofy; j < ch.length; j++) {
				
				
				if(ch[j] == inity) {
					
					count2++;
					
				}
				
		
				
			
			
		}
		
			
			if(count2 == 2 * count1) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		
		
		
		
		
		//System.out.println("print char "+Arrays.toString(ch));
		
		sc.close();
	}

}
