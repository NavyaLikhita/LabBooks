package com.cg.ui;
import java.io.*;
public class Ex4 {
public static void main(String[] args) {
	fileReader("D://Users//navya//Likhita.txt");
	
	fileReader("D://Users//navya");
}
public static void fileReader(String file) {
	File fr=new File(file);
	
	if (fr.exists()) {
		System.out.println("File exists");
	}else {
		System.out.println("File does not exist");
	}
	if (fr.canExecute()) {
		System.out.println("File can execute");
	}
	if (fr.canWrite()) {
		System.out.println("File can write ");
	}
	if(fr.canRead()) {
		System.out.println("File can read");
	}
	System.out.println("File name -> "+file);
	
	if(fr.isDirectory())
	{
		System.out.println(file +" is a Directory");
	}
	
	if(fr.isFile())
	{
		System.out.println(file +" is a File");
	}
	
	
}
}
