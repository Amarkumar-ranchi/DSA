package com.myjlc.bitwise;

//Problem 3:Find Whether Kth bit is Set or Not
//Position start from Right-Consider LSB as first bit
public class Lab3A {
	
	public static void main(String[] args) {
		
		int n=26;
		int k=3;
		 
	n=n>>k-1;
		if((n & 1)==0) {
			System.out.println("kth Bit is Not set");
		}else {
			System.out.println("kth Bit is set");
		}
		}
}

//Time Complexity-O(k)
