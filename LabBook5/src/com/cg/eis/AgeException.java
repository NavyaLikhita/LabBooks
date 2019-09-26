package com.cg.eis;

public class AgeException extends Exception {
public AgeException(String message) {
	// TODO Auto-generated constructor stub
super(message);
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "com.cg.lab.AgeException"+super.getMessage();
	}
}
