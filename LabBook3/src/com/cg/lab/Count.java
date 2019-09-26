
package com.cg.lab;

import java.util.Scanner;

public class Count {
	public static void charArrayCount(char []a) {
		int[] c=new int[256];
		for (int i = 0; i < a.length; i++) {
			c[a[i]]++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			
			int f=0;
			for (int j = i; j < a.length; j++) {
				if (a[i]==a[j]) {
					f++;
				}

			}
			if(f==1)
		System.out.println("Number of Occurences of "+a[i]+"="+c[a[i]]);
		}
	}
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String a =sc.next();	
	char x[] =a.toCharArray();
	charArrayCount(x);
	sc.close();
}
}
