package com.cg.ui;

public class Ex5 {

public static void main(String[] args) {
	age(9);
	age(20);
}

public static void age(int age){
	if (age<=15) {
		try {
			throw new AgeException("\n"+age+" Your Age is Below 15.");
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else System.out.println("Your Age is Above Equal to Or 15");
}
}
