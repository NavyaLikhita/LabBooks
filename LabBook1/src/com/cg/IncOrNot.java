package com.cg;
import java.util.*;
class IncOrNot
{
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		Long n=sc.nextLong();
		boolean sum =check(n);
		if(sum)
			System.out.println("It is an Increasing ");
		else
			System.out.println("It is Not Increasing ");
		sc.close();
	}
	 static boolean check(long n)
	{
		boolean flag=true; 
		while(n!=0)
		{
			long i=n%10;
			n=n/10;
			if(i<n%10)
			{
				flag=false;
			}
		}
		return flag;
	}
}