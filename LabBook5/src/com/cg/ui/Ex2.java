package com.cg.ui;


public class Ex2 {
	
	public static void main(String[] args) {
		System.out.println("Non-Recursive method result:");
	nonRecursive(5);
	System.out.println("\nRecursive method result:");
	System.out.print(""+Recursive(6));
	
}
	
	public static void nonRecursive(int i) {
		int a=1;
		int b=1;
		System.out.print(a+","+b);
		while(i>0) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(","+c);
			i--;
		}
		
	}
	public static int Recursive(int n) {

		if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return Recursive(n - 1) + Recursive(n - 2);
	}
		
}
