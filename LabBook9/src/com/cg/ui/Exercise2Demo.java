package com.cg.ui;
import java.util.Iterator;
import java.util.Map;

import com.cg.map.*;
public class Exercise2Demo {
public static void main(String[] args) {
	char[]a= {'a','a','b','b','c','c','d','a'};
Map<String, Integer>m=	Exercise2.countCharacter(a);
System.out.println("Character counts are: "+m);
}
}
