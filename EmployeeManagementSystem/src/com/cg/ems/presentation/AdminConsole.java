package com.cg.ems.presentation;

import java.util.Scanner;

public class AdminConsole {

	private String currentUser;

	public AdminConsole(String currentUser) {
		super();
		this.currentUser = currentUser;
	}
	 static Scanner scanner = new Scanner(System.in);
	public void start()
	{
		System.out.println("Welcome "+currentUser);

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
		case 1: addEmployee();	
		
		break;
		}
		}
		
	}
	private void addEmployee() {
		
		System.out.println("Enter Employee Id :");
		int id=scanner.nextInt();
		System.out.println("Enter Employee First Name :");
		scanner.nextLine();
		String empFirstName=scanner.nextLine();
		System.out.println("Enter Employee Last Name :");
		String empLastName=scanner.nextLine();
		System.out.println("Enter Employee DOB :");
		String dob=scanner.nextLine();
		System.out.println("Enter date of joining");
		String doj = scanner.nextLine();
		System.out.println("Enter employee department id");
		int empDeptId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee grade");
		String empGrade = scanner.nextLine();
		System.out.println("Enter employee designation");
		String empDesign = scanner.nextLine();
		System.out.println("Enter employee salary");
		int empSalary = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee gender");
		String empGender = scanner.nextLine();
		System.out.println("Enter employee marital status");
		String empMarStatus = scanner.nextLine();
		System.out.println("Enter employee address");
		String empAddress = scanner.nextLine();
		System.out.println("Enter employee contact number");
		String empPhNo=scanner.nextLine();
		System.out.println("Enter employee manager Id");
		int empMgrId = scanner.nextInt();
		
	}
}
