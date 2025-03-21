package com.myjlc.loops;

//27.Sum the  Cubes Digits of Given Number 
//Ex:123 ->1+2+3 =>6
//
public class Lab27 {

	public static void main(String[] args) {
 int n=123;
 int sum=0;
 while(n!=0) {
	 int digit=n%10;
	sum=sum+digit*digit*digit;
	n=n/10;
 }
 System.out.println(sum);
	}
}

//Time complexity-O(log n)
// Space complexity-O(1)
