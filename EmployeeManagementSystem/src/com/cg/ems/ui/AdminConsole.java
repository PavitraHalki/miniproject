package com.cg.ems.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;
import com.cg.ems.service.AdminServiceImpl;
import com.cg.ems.service.IAdminService;

public class AdminConsole {

	private String currentUser;
    
	public AdminConsole(String currentUser) {
		super();
		this.currentUser = currentUser;
	}
	IAdminService adminService=new AdminServiceImpl();
	 static Scanner scanner = new Scanner(System.in);
	public void start() throws EMSException
	{
		
		int choice = -1;
		
		while (choice != 5) {

			System.out.println("Menu:");
			System.out.println("Enter 1 for add details of employee");

			System.out.println("Enter 2 for updating employee details");
			System.out.println("Enter 3 for displaying all Employee details");
			System.out.println("Enter 4 for Exit");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
		
		
			switch (choice) {
		case 1:
					addEmployee();
				
		
		break;
		}
		}
		
	}
	private void addEmployee() throws EMSException {
		
        scanner.nextLine();
		System.out.println("Enter Employee Id :");
        String employeeId=scanner.nextLine();
		System.out.println("Enter Employee First Name :");
		String empFirstName=scanner.nextLine();
		System.out.println("Enter Employee Last Name :");
		String empLastName=scanner.nextLine();
		System.out.println("Enter Employee DOB :");
		String empDob=scanner.next();
		Date dateDob = new Date();
		
		
		System.out.println("Enter date of joining");
		String empDOJ =scanner.next();
		Date dateDoj = new Date();
		
		
		
		
		System.out.println("Enter employee department id");
		int empDeptId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee grade");
		String empGrade =scanner.nextLine();
		System.out.println("Enter employee designation");
		String empDesign =scanner.nextLine();
		System.out.println("Enter employee salary");
		int empSalary =scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee gender");
		String empGender =scanner.nextLine();
		System.out.println("Enter employee marital status");
		String empMarStatus =scanner.nextLine();
		System.out.println("Enter employee address");
		String empAddress =scanner.nextLine();
		System.out.println("Enter employee contact number");
		String empPhNo=scanner.nextLine();
		System.out.println("Enter employee manager Id");
		String empMgrId =scanner.nextLine();
		Employee employee=null;
		try {
			
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		
	
			dateDob=format.parse(empDob);
			
			dateDoj=format.parse(empDOJ);
			employee=new Employee(employeeId, empFirstName, empLastName, dateDob, dateDoj, empDeptId, empGrade, empDesign, empSalary, empGender, empMarStatus, empAddress, empPhNo, empMgrId);
			System.out.println("agide");
			boolean flag=adminService.addEmployee(employee);
			if(!flag)
			{
				throw new EMSException("Employee Cant be added!!!!!");
			}
			else
			{
				System.out.println("Employee added successfully :)");
			}
		} catch (ParseException e) {
			
			throw new EMSException("Date format is not correct");
		}
	
		
	  
		
		
	}
}
