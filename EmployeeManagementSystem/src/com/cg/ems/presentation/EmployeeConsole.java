package com.cg.ems.presentation;

import java.util.Scanner;

public class EmployeeConsole {
private Scanner scanner=new Scanner(System.in);
private String 	currentUser;

	
public EmployeeConsole(String currentUser) {
	super();
	this.currentUser = currentUser;
}





	public void start() {
		System.out.println("Welcome "+currentUser);

		int choice = -1;

		while (choice != 2) {

			System.out
					.println("[1]Serach Employee [2]LogOut");
			System.out.print("Choice> ");
			choice = scanner.nextInt();
			
			switch(choice){
			case 1:
				searchEmployee();
				
				break;
			}
		}
		
	}





	private void searchEmployee() {
		System.out.println("Enter the number to search based on condition: ");
		System.out.println("[1] based on Employee Id:");
		System.out.println("[2] based on Employee Name:");
		
	}

}
