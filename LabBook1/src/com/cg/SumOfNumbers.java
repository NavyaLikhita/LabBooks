//Calculate the sum of first n natural nbers which are divisible by 3 or 5.

package com.cg;

import java.util.Scanner;

class SumOfNumbers {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter a Natural number:");
			int n=sc.nextInt(); 
			if(n==0) {
				System.out.println("Please enter a Natural number only.!");
				
			}
			else {
				int Sum =calculateSum(n); 
				System.out.println(" Natural numbers which are divisible by 3 & 5 is: "+Sum);
				sc.close();
				
			}
			
			
			
			
		}
	static int calculateSum(int n)
	{
		int Sum=0;
		if(n>0)
		{
			for(int i = 1;  n>0 ;i++) {
				if(i%3==0 || i%5==0) {
					Sum+=i;
					--n;	
				}
			}
		}
		return Sum;
	}

}
