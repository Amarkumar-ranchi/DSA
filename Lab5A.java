package com.myjlc.bitwise;

//Problem 5:Check Whether given Number is 2 Power or Not

public class Lab5A {
	
	public static void main(String[] args) {
		
		int n=7;
		
		if((n&(n-1))==0)
	System.out.println("2 Power");	
	else 
		System.out.println("Not a 2 Power");	
	
	
	}
}


//Time Complexity-O(1)