package com.myjlc.loops;

//24.Count the Digits of Given Number 
//Ex:123 ->3
//
public class Lab24 {

	public static void main(String[] args) {
 int n=123;
 int count=0;
 while(n!=0) {
	//int digit=n%10;
	count++;
	n=n/10;
 }
 System.out.println(count);
	}
}

//Time complexity-O(log n)
// Space complexity-O(1)
