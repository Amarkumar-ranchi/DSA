package com.myjlc.leetcode;

//power of Four
public class Leetcode342 {
	public static boolean isPowerOfFour(int num) {
	if(num==0)
		return false;
	
	while(num%4==0) {
		num=num/4;
	}
	
	return num==1;
	}

 public static void main(String[] args) {
 
	 boolean result= isPowerOfFour(16);
	 System.out.println(result);
 }
}
 



