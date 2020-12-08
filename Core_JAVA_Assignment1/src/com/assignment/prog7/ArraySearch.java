package com.assignment.prog7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArraySearch {

	static int enteredNum;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		List<Integer> arrlist= Arrays.asList(5,12,14,6,78,19,1,23,26,35,37,7,52,86,47);
		
		System.out.println("Entered Array printing as list \n"+arrlist);
		
		System.out.println("Enter your number to search within array\n");
		
		
		
		try {
			Scanner sc= new Scanner(System.in);
			enteredNum= sc.nextInt();
			
			if(arrlist.contains(enteredNum))
			{
				System.out.println("Match found!!\n Entered number is : "+enteredNum);
			}
			else {
				throw new Exception(" Entered number is not matching with Array");
			}
		}
		
		catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private static Exception wrongSearchException() {
		// TODO Auto-generated method stub
		return null;
	}
}
