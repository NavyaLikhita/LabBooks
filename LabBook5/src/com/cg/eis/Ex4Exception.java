package com.cg.eis;

public  class Ex4Exception extends Exception
{public Ex4Exception() {
	// TODO Auto-generated constructor stub
}
	public Ex4Exception(String message) {
	super(message);
}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "com.cg.Exercise4Exception"+super.getMessage();
	}
	}
