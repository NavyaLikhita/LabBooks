package com.cg.ui;
import java.util.Map;

import com.cg.map.Exercise3;;
public class Exercise3Demo {
public static void main(String[] args) {
	int []a= {10,20,40};
	Map<Integer, Integer>m=Exercise3.getSquares(a);
	System.out.println("Numbers and their squares are: "+m);
}
}
