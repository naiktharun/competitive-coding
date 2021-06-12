package com.chef.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LifeTheUniverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> x = new ArrayList<>();

		int input_val = 0;
		int i = 0;
		while (input_val != 42) {
			x.add(sc.nextInt());

			input_val = x.get(i);
			i++;

		}

		Iterator<Integer> itr = x.iterator();
		System.out.println(itr);
		while (itr.hasNext()) {
			int z = itr.next();
			if (z != 42) {
				System.out.println(z);
			}

		}

		sc.close();

	}

}






/*
 * class TestClass { public static void main(String args[] ) throws Exception {
 * 
 * InputReader scn = new InputReader(System.in);
 * 
 * StringBuilder stringbuilder = new StringBuilder();
 * 
 * int a = scn.readInt();
 * 
 * while(a!=42) { stringbuilder.append(a).append("\n"); a = scn.readInt(); }
 * 
 * System.out.println(stringbuilder);
 * 
 * } }
 */