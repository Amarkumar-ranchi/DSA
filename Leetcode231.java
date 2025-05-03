package com.myjlc.bitwise;

//Problem : count the set Bits
//Brain Kerninghan's Algorithm
//Visit only Set bits instead of visting all the Bits

public class Leetcode231 {
	public static boolean isPowerOfTwo( int num) {
	        
	return (num>0)&&(num&(num-1))==0;
	
	    }
public static void main(String[]args) {

	int num=32;
boolean x=isPowerOfTwo(num);
	System.out.println(x);
}
          }

//Time complexity-O(1)


