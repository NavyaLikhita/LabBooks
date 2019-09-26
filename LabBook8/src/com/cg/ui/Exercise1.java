package com.cg.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Ex1 {
	
		public static void main(String[] args) {
		System.out.println("Enter Integer: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s=br.readLine();
			getStringTokenizer(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		public static void getStringTokenizer(String string) {
			int sum=0;
			StringTokenizer st=new StringTokenizer(string," ");
			while(st.hasMoreTokens()) {
				int a=Integer.parseInt(st.nextToken());
				 sum+=a;
				System.out.println(a);
			}
			System.out.println(sum);
		}

}
