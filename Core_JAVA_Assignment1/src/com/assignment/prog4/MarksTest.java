package com.assignment.prog4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MarksTest {

	public static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Math marks:\t");
		Scanner sc = new Scanner(System.in);
		int math= sc.nextInt();
		System.out.println("English marks:\t");
		Scanner sc1 = new Scanner(System.in);
		int eng = sc1.nextInt();
		System.out.println("Civic marks:\t");
		Scanner sc2 = new Scanner(System.in);
		int civic= sc2.nextInt();
		
		ArrayList<Integer> markList= new ArrayList<>();
		markList.add(math);
		markList.add(eng);
		markList.add(civic);
		
		if(!markList.isEmpty()) {
			
		for(Integer intVal: markList) {
			if(intVal>=60) {
				count++;
			}
		}
		
		if(count>=3)
		{
			System.out.println("Passed");
		}
		if(count==2) {
			System.out.println("Promoted");
		}
		if(count<2) {
			System.out.println("Failed!!");
		}
		}
		}
		
 		
		
}
