package com.cg.map;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
public static Map  countCharacter(char a[]) {
	Map<String, Integer>m = m=new HashMap<>();
	int[] c=new int[256];
	int l=0;
	for (int i = 0; i < a.length; i++) {
		c[a[i]]++;
		
	}
	for (int i = 0; i < a.length; i++) 
	{
		
		int f=0;
		for (int j = i; j < a.length; j++) {
			if (a[i]==a[j]) {
				f++;
			}

		}
		if(f==1) 
		{
			//System.out.println(a[i]+"  number of occurence ==>"+c[a[i]]);
			
			String s=Character.toString(a[i]);
			m.put(s, c[a[i]]);
			
		}
	
	}
	return m;
}
}
