package com.myjlc.loops;

//25.Sum the Digits of Given Number 
//Ex:123 ->1+2+3 =>6
//
public class Lab25 {

	public static void main(String[] args) {
 int n=123;
 int sum=0;
 while(n!=0) {
	 int digit=n%10;
	sum=sum+digit;
	n=n/10;
 }
 System.out.println(sum);
	}
}

//Time complexity-O(log n)
// Space complexity-O(1)
