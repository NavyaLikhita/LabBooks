package com.cg.eis;

public class EmployeeException extends Exception {
public EmployeeException(String message) {
	super(message);

}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "com.cg.eis.exception"+super.toString();
	}
}
