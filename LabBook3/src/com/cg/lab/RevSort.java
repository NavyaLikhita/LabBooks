package com.cg.lab;

import java.util.Arrays;
import java.util.Scanner;

public class RevSort {
	public static int[] getSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			String 	strings=Integer.toString(a[i]);
			
			char []rev=strings.toCharArray();
			strings="" ;
			for (int j = rev.length-1; j>=0;j--) {
				strings+=rev[j]+"";
			}
			
			a[i]=Integer.parseInt(strings);
			
		}	
		Arrays.sort(a);	
		return a;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to accept as an integer array:");
		int x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter "+x+" Numbers:");
		for(int i =0;i<x;i++) {
			a[i]=sc.nextInt();	
		}
		a=RevSort.getSort(a); 
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
