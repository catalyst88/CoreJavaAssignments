package com.assignment.prog9;

import java.util.Scanner;

public class AvgMarks {

	
	public static int AvgScore;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		for(int j=1;j<4;j++) {
		int indTotalScore=0;
		System.out.println("Enters the marks for student\n");
		Scanner sc= new Scanner(System.in);
		String temp= sc.next();
		for(int i=1;i<4;i++) {
			System.out.println("Enter Makr for subject"+i);
			Scanner sc1= new Scanner(System.in);
			int mark= sc.nextInt();
			indTotalScore=mark+indTotalScore;
		}
		
		System.out.println("Total Score for "+ temp +" is :\t"+ indTotalScore);
		System.out.println("Average score"+ temp +" is :\t"+ indTotalScore/3 );
	} }

}
