package com.myjlc.leetcode;

//power of three
public class Leetcode326 {
	public static boolean isPowerOfThree(int num) {
	if(num==0)
		return false;
	while(num%3==0) {
		System.out.println(num);
		num=num/3;
	}
	System.out.println(num);
	return num==1;
	}

 public static void main(String[] args) {
 
	 boolean result= isPowerOfThree(27);
	 System.out.println(result);
 }
}
 



