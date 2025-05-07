package com.myjlc.recursion;
//Problem 2 :Factorial of given number
public class Lab9 {
static int fact(int n) {
	if(n==0||n==1)
		return 1;
	else
	 return n*fact(n-1);
	
}
	public static void main(String[] args) {
int fact=fact(5);
System.out.println(fact);
	}
}

//Time complexity:O(n)
//space complexity:O(n)