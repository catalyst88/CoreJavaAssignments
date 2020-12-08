package com.assignment.prog8;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] origanlArray= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		System.out.println("Entered Array");
		for(int i=0;i<origanlArray.length;i++) {
			System.out.print(" "+origanlArray[i]);
		}
		//
		sorting(origanlArray);
		
		
	}

	static void sorting(int[] intArr) {
		
		boolean sorted = false;
		int tempVar;
		
		System.out.println("\n\nSorted Array\n");
		for(int i=0; i<intArr.length-1;i++)
		{
			for(int j=1;j<intArr.length;j++) {
				if(intArr[j-1]>intArr[j]){
					tempVar=intArr[j-1];
					intArr[j-1]=intArr[j];
					intArr[j]=tempVar;
					
				}
			
		}
		
			
		
		}
		
		for(int p=0;p<intArr.length;p++) {
			System.out.print(" "+intArr[p]);
		}
		
	}
}
