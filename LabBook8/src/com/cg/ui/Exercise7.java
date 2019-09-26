package com.cg.ui;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Ex7 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User name: ");
		String str = sc.nextLine();
		boolean f = registeringUserName(str);
		System.out.println("method "+f);
		sc.close();
		}
		public static  boolean registeringUserName(String s)
		
		{
				if(s.endsWith("_job")) {
					StringTokenizer st=new StringTokenizer(s, "_job");
					int a=st.nextToken().length();
					if(a>=8) 
					
						return true;
					else 
						return false;
				}
				else
			return false;
			
		}
}
