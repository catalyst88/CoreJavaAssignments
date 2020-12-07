package com.assignment.prog6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsernamePassword   {

	
	public static String strUsername = "vbhadane";
	public static String strPassword= "Password";
	public static int passCount;
	public static int usernameCount;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		/*
		 * if(strUsername.equals(enteredUsr)) { System.out.println("pass"); }
		 */
		
		 for (int i=0;i<3;i++) { 
			 System.out.println("Please enter your username: \n");
				Scanner sc= new Scanner(System.in);
				String enteredUsr=sc.nextLine().toString();
			 if(strUsername.equals(enteredUsr)) {
				 i+=3;
				 /*
				  * Password match here
				  */
				
				 
				 for (int p=0; p<3; p++) {
					System.out.println("Please Enter password : \n");
					Scanner sc1= new Scanner(System.in);
					String enteredPass= sc1.nextLine().toString();
					
					if(strPassword.equals(enteredPass)) {
						p+=3;
					}
					else 
					{
						if(p==2) {
							throw new InputMismatchException("Password max attempt reached!!");
						}
						else 
							System.out.println("try again!!");
					}
					
					
					
				 }
				 
				 
				 
				}else 
				{
					if(i==2) {
						throw new InputMismatchException("Username max attempt reached!!");
					}
					else 
						System.out.println("try again!!");
				}
			 
		 }
		 
	}

	private static Exception LoginExecetion() {
		// TODO Auto-generated method stub
		return null;
	}

}
