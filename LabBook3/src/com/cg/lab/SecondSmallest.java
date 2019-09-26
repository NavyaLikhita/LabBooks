package com.cg.lab;

import java.util.Scanner;

public class SecondSmallest {
	public int getSecondSmallest(int[]a){
		int tem=0, i = 0;
		for (i=0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}
		}
		tem=a[0];
		for(i=1;i<a.length;i++) {
			if(a[i]>tem) {
				break;
			}	
		}
		return a[i];
	}
	public static void main(String[] args) {
		SecondSmallest e=new SecondSmallest();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to accept as an integer array:");
		int x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter "+x+" Numbers:");
		for(int i =0;i<x;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println("Second Smallest Element is: "+e.getSecondSmallest(a));
		sc.close();
	}
}
