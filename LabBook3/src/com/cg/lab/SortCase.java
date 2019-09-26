

package com.cg.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SortCase {
	public static void stringSort(String a[]) {
		Arrays.sort(a);
		int n=a.length;
		if (n%2==1) {
			n++;
		}
		n/=2;
		
		for (int i = 0; i < n; i++) {
			a[i]=a[i].toUpperCase();
			
		}
		for (String string : a) {
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many String to accept as an array:");
		int x=sc.nextInt();
		String a[]=new String[x];
		System.out.println("Enter "+x+" Strings:");
		for(int i =0;i<x;i++) {
			a[i]=sc.next().toLowerCase();	
		}
		SortCase.stringSort(a);
		sc.close();
	}
}
