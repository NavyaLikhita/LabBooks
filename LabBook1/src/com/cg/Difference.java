
package com.cg;

import java.util.Scanner;

class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Natural number:");
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println("Please enter a Natural number only!");

		} else {
			double diff = 0;
			diff = (n * (n + 1) * (2 * n + 1)) / 6 - Math.pow(((n * (n + 1)) / 2), 2);
			System.out.println("natural numbers is: " + diff);
			sc.close();

		}
	}
}
