package com.cg.ems.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.LeaveHistory;
import com.cg.ems.service.EmployeeServiceImpl;
import com.cg.ems.service.IEmployeeService;

public class EmployeeConsole {
private Scanner scanner=new Scanner(System.in);
private String 	currentUser;

IEmployeeService employeeService=new EmployeeServiceImpl();
	
public EmployeeConsole(String currentUser) {
	super();
	this.currentUser = currentUser;
}





	public void start() throws EMSException {
		System.out.println("Welcome "+currentUser);

		int choice = -1;

		while (choice != 2) {

			System.out
					.println("[1]Serach Employee [2]Apply for leave [3]LogOut");
			System.out.print("Choice> ");
			choice = scanner.nextInt();
			
			switch(choice){
			case 1:
				searchEmployee();
			 break;
			case 2:
				applyForLeave();
				break;
			case 3:updateLeaveStatus();
			break;
			}
		}
		
	}





	private void updateLeaveStatus() {
		scanner.nextLine();
	System.out.println("enter Id");
	String mgrId=scanner.next();
		LeaveHistory leaveHistory=employeeService.modifyLeaveStatus(mgrId);
		
	}





	private void applyForLeave() throws EMSException {
		
			
		scanner.nextLine();
	System.out.println("Enter Employee Id: ");
    String empId=scanner.next();	
    System.out.println("Enter From Date: ");
    String fromDate=scanner.next();	
    Date dateFrom=new Date();
   
    System.out.println("Enter To Date: ");
    String toDate=scanner.next();
    Date dateTo=new Date();
    try{
    SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
    dateFrom=format.parse(fromDate);
    dateTo=format.parse(toDate);
    long diff=dateTo.getTime()-dateFrom.getTime();
	long noofdays=diff/(1000*60*60*24);
  LeaveHistory leaveHistory=new LeaveHistory(noofdays, dateFrom, dateTo, empId);
  System.out.println("consoleE");
  
  boolean flag=employeeService.applyForLeave(leaveHistory);
  System.out.println("consoleL");
  if(flag)
  {
	  System.out.println("Leave applied succe");
  }
  else
  {
	  throw new EMSException("Leave not applied");
  }
    } catch (ParseException e) {
		
		throw new EMSException("Date format is not correct");
	}
   
    
  //  employeeService.a
    
   
	}





	private void searchEmployee() {
		System.out.println("Enter the number to search based on condition: ");
		System.out.println("[1] based on Employee Id:");
		System.out.println("[2] based on Employee Name:");
	}

}
