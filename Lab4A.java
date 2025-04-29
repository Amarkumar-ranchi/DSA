package com.myjlc.bitwise;

//Problem 4:Count the Set Bits
//Brain Kerningam Algorithm
//Visiting only Set Bits and Counting the SetBits

public class Lab4A {
	
	public static void main(String[] args) {
		
		int n=25;
		int count=0;
		int loopCount=0;
		
		while(n>0) {
		n=n&n-1;
				count++;
	
		}
	System.out.println("Set Bit Count:"+count);	
	
	}
}


//Time Complexity-O(63)/O(1)