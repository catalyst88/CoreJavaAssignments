package com.assignment.prog3;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class SimpleCompoundInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float simpleInt;
		System.out.println("Calculate simple interest");
		System.out.println("Enter principal : \t");
		Scanner sc = new Scanner(System.in);
		float principal = sc.nextFloat();
		
		System.out.println("Enter Years : \t");
		Scanner sc1= new Scanner(System.in);
		int years= sc1.nextInt();
		System.out.println("Enter Interest : \t");
		Scanner sc2= new Scanner(System.in);
		float intRate=  sc2.nextFloat();
		
		System.out.println("principal\t"+principal+"\tYears\t"+years+"\tInterest Rate\t"+intRate);
		
		/*
		 * SimpleCompoundInt a = new SimpleCompoundInt() ; a.main(); a.main(1);
		 */
		
		System.out.println("*************CALCULATE SIMPLE INTEREST**************");
		System.out.println((principal*years*intRate)/100);
		
		System.out.println("*************CALCULATE COMPUND INTEREST**************");
		//p(1+r)()-P
		System.out.println((principal* Math.pow((1+intRate/100), years)));
	}

	public void main() {
		System.out.println("returning main()");
	}
	public int main(int a) {
		System.out.println("retutning a from main(int a)");
		return a;
	}
}
