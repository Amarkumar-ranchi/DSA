package com.myjlc.leetcode;

//power of three
public class Leetcode326R {
	public static boolean isPowerOfThree(int num) {
	if(num==0)
		return false;
		
	if(num==1)
		return true;
		
	if(num%3!=0)
		return false;
	
	return isPowerOfThree(num/3);
	
	
	}

 public static void main(String[] args) {
 
	 boolean result= isPowerOfThree(6);
	 System.out.println(result);
 }
}
 



