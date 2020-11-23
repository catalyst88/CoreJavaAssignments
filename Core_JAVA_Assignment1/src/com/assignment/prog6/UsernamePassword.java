package com.assignment.prog6;

import java.util.Scanner;

public class UsernamePassword {

	
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
			 System.out.println("Please enter your username ");
				Scanner sc= new Scanner(System.in);
				String enteredUsr=sc.nextLine().toString();
			 if(strUsername.equals(enteredUsr)) {
				 i+=3;
				}else {
					System.out.println("try again!!");
				}
			 
		 }
		 
	}

}
