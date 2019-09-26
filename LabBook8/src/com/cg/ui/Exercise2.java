package com.cg.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ex2 {
	
	public static void main(String[] args) {
		File f=new File("D://Users//navya//Likhita.txt");
	fileReader(f);
	}
	public static void fileReader(File f) {
		String line;
		int c=1;
	try {
		FileInputStream fi=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(fi);
		BufferedReader br=new BufferedReader(isr);
		while ((line=br.readLine())!=null) {
			System.out.println(c+" "+line);
			c++;
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
