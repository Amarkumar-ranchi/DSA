package com.myjlc.loops;

//23.Print the Digits of Given Number 
//Ex:123 -> 1,2,3
public class Lab23 {

	public static void main(String[] args) {
 int n=12345;
 
 while(n!=0) {
	int digit=n%10;
	System.out.println(digit);
	n=n/10;
 }
	}
}

//Time complexity-O(log n)
// Space complexity-O(1)
