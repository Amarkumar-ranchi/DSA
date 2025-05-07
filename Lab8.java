package com.myjlc.recursion;
//Problem 1 :Sum of Number from 1 to N
public class Lab8 {
static int sum(int n) {
	if(n==1)
		return 1;
	else
	 return n+sum(n-1);
	
}
	public static void main(String[] args) {
int sum=sum(5);
System.out.println(sum);
	}
}

//Time complexity:O(n)
//space complexity:O(n)