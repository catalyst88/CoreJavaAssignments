package com.assignment.prog5;

import java.util.Scanner;

public class TestSalaryTaxSlab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your Yaerly Income to calculate Tax");
		
		Scanner sc= new Scanner(System.in);
		int salary= sc.nextInt();
		
		if(salary>= 181001 && salary<=300000) {
			System.out.println("Taxable salary"+salary/10);
		}else
		if(salary>= 300001 && salary<=500000) {
			System.out.println("Taxable salary"+salary/20);
		}else
		if(salary>= 500001 && salary<=1000000) {
			System.out.println("Taxable salary"+salary/30);
		}else {
			System.out.println("You salary is not  taxable ");
		}
		
	}

}
