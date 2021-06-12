package com.chef.code;

import java.util.ArrayList;
import java.util.Scanner;

public class FacebookProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();

		int nphotos = sc.nextInt();

		ArrayList<Integer> x = new ArrayList<Integer>();

		ArrayList<Integer> y = new ArrayList<Integer>();

		for (int i = 0; i < nphotos; i++) {

			x.add(sc.nextInt());
			y.add(sc.nextInt());

		}

		for (int j = 0; j < nphotos; j++) {

			if (length > x.get(j) || length > y.get(j)) {
				System.out.println("UPLOAD ANOTHER");
			}

			else {
				if (x.get(j).equals(y.get(j)) || x.get(j).equals(length) && y.get(j).equals(length)) {

					System.out.println("ACCEPTED");
				}

				else {
					// l = 640 , x = 1000, y = 500
					System.out.println("CROP IT");
				}

			}
		}
	}

}
