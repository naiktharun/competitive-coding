package com.chef.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeadGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		int lead = 0;
		
		//int[] x = new int[2000];
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		//int[] y = new int[2000];
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		ArrayList<Integer> leads = new ArrayList<Integer>();
		
		ArrayList<Integer> winner = new ArrayList<Integer>();
		
		
		for(int i=0; i<rounds; i++) {
			
			 x.add(sc.nextInt()); 
			 y.add(sc.nextInt());
			 
			 
			 
			 
			
		}
		
		//check for max lead
		
		for(int j = 0; j< rounds; j++) {
			
			
			
			leads.add(Math.abs(x.get(j)- y.get(j)));
			
			
		}
		
		int final_lead = Math.abs(Collections.max(leads));
		int indexOfLead = leads.indexOf(final_lead);
		
		for(int k = 0; k< rounds; k++) {
			
			
			
			winner.add((x.get(k)- y.get(k)));
			
			
		}
		
		int getWinner = winner.get(indexOfLead);
		
		/*
		 * System.out.println(Arrays.toString(x.toArray()));
		 * System.out.println(Arrays.toString(y.toArray()));
		 */
		
	
	
		
		
		if(getWinner > 0) {
			System.out.println("1 "+ final_lead);
		}
		else
		{
		System.out.println("2 "+ final_lead);

	}

}
	
}
