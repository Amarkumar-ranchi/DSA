package com.myjlc.leetcode;

//power of Four
public class Leetcode342R {
	public static boolean isPowerOfFour(int num) {
		if(num==0)
			return false;
			
		if(num==1)
			return true;
			
		if(num%4!=0)
			return false;
		
		return isPowerOfFour(num/4);
		
		
	}

 public static void main(String[] args) {
 
	 boolean result= isPowerOfFour(15);
	 System.out.println(result);
 }
}
 



