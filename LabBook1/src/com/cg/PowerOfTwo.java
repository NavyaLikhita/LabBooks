
package com.cg;

import java.util.*;

class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		boolean Sum = check(n);
		if (Sum) {
			System.out.println("It is a Power of 2.");
		} else {
			System.out.println("It is Not a Power of 2.");
		}
		sc.close();
	}

	static boolean check(int n) {
		int N = n;
		int a = 1;
		n = n / 2;
		boolean flag = false;
		while (n != 0) {
			a = a * 2;
			if (N == a) {
				flag = true;
			}
			n--;
		}
		return flag;
	}
}