package com.chef.code;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class AtmCode
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner input1 = new Scanner(System.in);
		
		double x = input1.nextDouble();
		
		
		double y= input1.nextDouble();
		
	
		
		
		if((x%5 == 0) && x < 2000 && y < 2000 && x < y) {
		    double z = (y-x) - 0.5;
		    System.out.printf("%.2f",z);
		    
		}
		
		else
		{
			System.out.printf("%.2f",y);
		}
	
		
}
}
