package com.assignment1.prog2;

public class Programme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNum;
		int remainder;
		//int result = 0;
		
		for(int i=100;i<1000;i++) {
			originalNum=i;
			int result = 0;
			//System.err.println("originalNum\t"+originalNum);
			while(originalNum!=0) {
				remainder = originalNum%10;
				
				result= result+(remainder*remainder*remainder);
				
				//System.out.println("result\t"+result);
				originalNum= originalNum/10;
			}
			if (i==result) {
				System.out.println(i);
			}
			
		}
		
	}

}
