package com.myjlc.recursion;
//Problem 3 :Sum of Indiviual Digits of given number
//n=123=>1+2+3=>6
public class Lab10 {
static int digitSum(int n) {
	if(n==0)
		return 0;
	else
	 return n%10+digitSum(n/10);
	
}
	public static void main(String[] args) {
int digitSum=digitSum(12345);
System.out.println(digitSum);
	}
}

//Time complexity:O(n)
//space complexity:O(n)