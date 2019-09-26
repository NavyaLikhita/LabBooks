package com.cg.map;

import java.util.*;


public class Exercise1 {
public static List<String> getValues(HashMap<Integer,String> hm){
	//System.out.println(hm);
	Collection<String> c= hm.values();
	//System.out.println(c);
	List<String> l=new ArrayList<String>(c);
	//System.out.println(l);
Collections.sort(l);

return l;
}

}
