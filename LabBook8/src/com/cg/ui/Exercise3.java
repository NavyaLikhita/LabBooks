package com.cg.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
	public static void main(String[] args) {
		File f=new File("D:\\Navya\\File.txt");
		fileReader(f);
	}
	
	public static void fileReader(File f) {
		String line;
		
		int Line=0;
		int words=0;
		int chart=0;
	try {
		FileInputStream fi=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(fi);
		BufferedReader br=new BufferedReader(isr);
		while ((line=br.readLine())!=null) {
						
			if(!line.equals("")) {
				chart+=line.length();
				String[]word=line.split(" ");
				words +=word.length;
				
			}
			Line++;	
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("line "+Line);
	System.out.println("words "+words);
	System.out.println("char "+chart);
	}
}
