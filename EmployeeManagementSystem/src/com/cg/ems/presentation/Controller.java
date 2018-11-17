package com.cg.ems.presentation;


import java.util.Scanner;


public class Controller {
	 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice = -1;
		while(choice!=2 ){
			System.out.print("[1]Login [2]LogOut >");
			choice = scanner.nextInt();
			if(choice==1){
			
			System.out.println("Login Page");
			System.out.println("Enter User Name:");
			String userName=scanner.next();
			
			System.out.println("Enter password");
			/*scanner.nextLine();*/
			String password=scanner.next();
			try {
				System.out.println("inside");
				//String role = userService.getRole(userName, password) ;
				/*System.out.println(role);
				if("admin".equals(role)){*/
				if((userName.equals("a"))&&(password.equals("123")))
				{
					System.out.println("if");
					AdminConsole ac = new AdminConsole(userName);
					ac.start();
					System.out.println("**");
				}else{
					System.out.println("ghf");
					EmployeeConsole emp = new EmployeeConsole(userName);
					emp.start();
				}					
			} //catch (LMSException e) {
			catch(Exception e){
				System.err.println(e.getMessage());
			}				
		}
	}
	scanner.close();
	System.out.println("Program Terminated");
}	

}