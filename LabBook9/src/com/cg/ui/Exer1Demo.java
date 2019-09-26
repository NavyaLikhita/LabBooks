package com.cg.ui;
import com.cg.map.*;
import java.util.HashMap;
import java.util.List;

public class Exer1Demo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"125");
		hm.put(2, "100");
		hm.put(3,"102");
		hm.put(4, "111");
	List<String> l=Exercise1.getValues(hm);
	System.out.println("Values in Sorted Order are: "+l);
	}
}
