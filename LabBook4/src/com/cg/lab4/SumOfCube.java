package com.cg.lab4;

import java.util.Scanner;

public class SumOfCube {
public static void main(String[] args) {
	System.out.println("Enter the Number:");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("The Sum of Cubes of Number is = "+setSumOfCube(num));
	sc.close();
}
public static int setSumOfCube(int num) {
	int sum = 0;
	while(true)
	{
		if((num%10)!=0)
		{
			int a = num%10;
			sum = (int) (sum + Math.pow(a, 3)); 
			num = num/10;
		}
		if(num == 0)
		{
			break;
		}
	}
	return sum;
}
}