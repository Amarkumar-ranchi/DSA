package com.myjlc.bitwise;

//Problem 2:Find Whether Given Numbers Even or Odd

public class Lab2 {
	
	public static void main(String[] args) {
		
		int n=2;
		if((n & 1)==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
		}

}

//Time Complexity-O(1)