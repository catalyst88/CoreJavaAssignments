package com.assignment1.prog1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Armstrong number
		//int originalNumber;
		int reminder;
		int result = 0;
		 int num = 0;
		System.out.println("Enter number to check Armstrong number!! \n");
		Scanner sc= new Scanner(System.in);
		int originalNumber= sc.nextInt();
		num= originalNumber;
		//System.out.println(originalNumber);
		
		   while (originalNumber != 0) {
		       // remainder contains the last digit
			   reminder = originalNumber % 10;
		        
		       result += reminder * reminder * reminder;
		       
		       System.out.println(result);
		       originalNumber =originalNumber/ 10;
		    }

		    if (result == num)
		        System.out.println(num+ "This is an Armstrong number");
		    else
		        System.out.print(num+" is not an Armstrong number");

	}

}
