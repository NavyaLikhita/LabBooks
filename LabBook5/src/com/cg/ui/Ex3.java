package com.cg.ui;

import java.util.Scanner;

public class Ex3 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the Number");
	primeNumbers(sc.nextInt());
	sc.close();
}
public static void primeNumbers(int a) {
	System.out.println("Prime Numbers are :");
	for (int i = 2; i < a; i++) {
		int p=0;
		for (int j = i; j>=1; j--) {
			
			if(i%j==0) {
				p++;
			}
			
		}
		if(p==2)
			System.out.print(i+" ");
	}
}
}
