package com.myjlc.bitwise;

//Problem 1:Find Whether Last bit is Set or Not

public class Lab1 {
	
	public static void main(String[] args) {
		
		int n=19;
		if((n & 1)!=0) {
			System.out.println("Last Bit is  Set");
		}else {
			System.out.println("Last Bit is Not  Set");
		}
		}

}

//Time Complexity-O(1)