package com.cg.eis.ui;

import java.util.Scanner;
import java.awt.image.ImagingOpException;
import java.io.*;
import java.lang.*;

import com.cg.eis.dto.Employee;
import com.cg.eis.service.EmpService;
import com.cg.eis.service.Validator;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

import java.util.*;
public class SystemInterface{

	public static void main(String[] args) throws IOException{
		System.out.println("Welcome To EIC");	
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		EmpService ser=new EmpService();
		
		while(true)
		{
			
			System.out.println("1.Add New Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Find Employee");
			System.out.println("5.Display All Employee");
			System.out.println("6.Exit");
			
			String choice = br.readLine();
			
			switch(choice)
			{
				case "1":
					int id=0;
					String name="";
					double sal=0.0;
					String desg="";
					System.out.println("Enter Employee Id: ");
		 			  while(true)
		 			  {
		 				  String e_id=br.readLine();
		 				  boolean ch1=Validator.validatedata(e_id, Validator.empIdpattern);
		 				  if(ch1==true)
		 				  {
		 					  try 
		 					  {
		 						id=Integer.parseInt(e_id); 
		 						break;
		 					  }
		 					  catch(NumberFormatException e)
		 					  {
		 						  System.out.println("Employee Id Must Be Numeric. Re Enter");
		 					  }
		 				  }
		 				  else 
		 				  {
		 					  System.out.println("Re Enter Employee ID in 3 digits");
		 				  }
		 			  }
		 			  
		 			 
		 			  
		 			 System.out.println("Enter Employee Name:");
					  while(true)
					  {
						  String empn=br.readLine();
						  boolean ch1=Validator.validatedata(empn, Validator.empNamepattern);
						  if(ch1==true)
						  {
							  try 
							  {
								name=empn;
								break;
							  }
							  catch(NumberFormatException e)
							  {
								  System.out.println("Invalid Name, Re-Enter Name:");
							  }
						  }
						  else
						  {
							  System.out.println("Re-Enter Employee Name:");
						  }
					  }
					  
					  System.out.println("Enter Salary:");
					  while(true)
					  {
						  String e_sal=br.readLine();
						  
						  try {
							  sal=Double.parseDouble(e_sal);
						  }
						  catch(NumberFormatException e)
						  {
							  System.out.println("Salary Must Be Numeric");
						  }
						  
						  
						  if(sal<=0)
							  System.out.println("Invalid Salary, ReEnter");
						  else
						  {
							  break;
						  }
					  }
					  
					  System.out.println("Enter Employee Designation");
					  while(true)
					  {
						  String emp_desg=br.readLine().trim().toLowerCase();
						  boolean ch1=Validator.validatedata(emp_desg, Validator.empDesgpattern);
						  if(ch1==true)
						  {
							  try 
							  {
								desg=emp_desg;
								break;
							  }
							  catch(NumberFormatException e)
							  {
								  System.out.println("Invalid Designation Re Enter Designation");
							  }
						  }
						  else
						  {
							  System.out.println("Re Enter Employee Designation");
						  }
					  }
					  Employee ob=new Employee(id,name,sal,desg);
					  ser.addEmployee(ob);
					  break;
					
				case "2":
					System.out.println("Enter Employee Id");
							String t=br.readLine();
	 			   			id=Integer.parseInt(t);
	 			   			
	 			   			
	 			   			if (ser.findEmployee(id)!=null)
	 			   			{
	 			   			if(ser.deleteEmployee(ser.findEmployee(id))==true)
	 			   				System.out.println("Deleted-Successful");
	 			   			else
	 			   			System.out.println("Un-Successful");	
	 			   			}
	 			   			else
	 			   			System.out.println("Employee Not Found");
					break;
				case "3":
					
						int id1=0;
						String name1="";
						double sal1=0.0;
						String desg1="";
						 System.out.println("Enter Employee Id");
			 			  while(true)
			 			  {
			 				  String e_id=br.readLine();
			 				  boolean ch1=Validator.validatedata(e_id, Validator.empIdpattern);
			 				  if(ch1==true)
			 				  {
			 					  try 
			 					  {
			 						id1=Integer.parseInt(e_id); 
			 						break;
			 					  }
			 					  catch(NumberFormatException e)
			 					  {
			 						  System.out.println("Employee Id Must Be Numeric. Re Enter");
			 						  break;
			 					  }
			 				  }
			 				  else 
			 				  {
			 					  System.out.println("Re Enter Employee ID in 3 digits");
			 					  break;
			 				  }
			 			  }

			 			 
			 			  Employee ob2=ser.findEmployee(id1);
			 			  name1=ob2.getEmpName();
			 			  
			 		System.out.println("Enter Updated Salary ");
						while(true)
						{
						  String e_sal=br.readLine();
						  
						  try {
							  sal1=Double.parseDouble(e_sal);
						  }
						  catch(NumberFormatException e)
						  {
							  System.out.println("Salary Must Be Numeric");
							  break;
						  }
						  
						  
						  if(sal1<=0)
						  {
							  System.out.println("Invalid Salary, ReEnter");
							  break;
						  }
						  else
						  {
							  break;
						  }
					  }		
						System.out.println("Reenter/Update Employee Designation");
						  while(true)
						  {
							  String emp_desg=br.readLine().toLowerCase();
							  boolean ch1=Validator.validatedata(emp_desg, Validator.empDesgpattern);
							  if(ch1==true)
							  {
								  try 
								  {
									desg1=emp_desg;
									break;
								  }
								  catch(NumberFormatException e)
								  {
									  System.out.println("Invalid Designation Re Enter Designation");
									  break;
								  }
							  }
							  else
							  {
								  System.out.println("Re Enter Employee Designation");
								  break;
							  }
						  }
						  Employee ob1=new Employee(id1,name1,sal1,desg1);
						  ser.addEmployee(ob1);
						  break;
				case "4":
					
					System.out.println("Enter Employee Id For Finding Employee");
					String s=br.readLine();
	 				int emp_id=Integer.parseInt(s);
	 				
	 				Employee emp =ser.findEmployee(emp_id);
	 				
	 				if(emp!=null)
	 				{
	 					ser.printStatement(emp);
	 					break;
	 				}
	 				else
					break;
					
				case "5":
						List<Employee> list=new ArrayList<>(ser.getAllEmployee());
						if(list.size()>0)
						{
						
						for(Employee e: list)
						{
							ser.printStatement(e);
						}
						
						}
						else
							System.out.println("No Record Found");
				break;
				case "6":System.out.println("Exiting");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
			}
			
		}
		
	}
}