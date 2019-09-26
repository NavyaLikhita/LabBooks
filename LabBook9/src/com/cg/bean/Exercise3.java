package com.cg.map;

import java.util.*;

public class Exercise3 {
	public static Map getSquares(int[]a) {
		Map<Integer, Integer>m = m=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			m.put(a[i], (a[i]*a[i]));
			
		}
		return m;
		
	}
}
