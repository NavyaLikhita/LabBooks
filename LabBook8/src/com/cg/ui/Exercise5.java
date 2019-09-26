package com.cg.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		boolean b=Ex5.stringCheck(str);
		if(b)
			System.out.println("String type is positive. ");
		else
			System.out.println("String type is not positive.");
		sc.close();
	}
		public static boolean stringCheck(String s) {
			char[]a=s.toCharArray();
			
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				if(a[i]!=s.charAt(i)) {
					return false;
				}
			}	
		return true;
		}
}
