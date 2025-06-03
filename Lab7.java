package com.myjlc.recursion;
//Problem 2:print the Number from 1 to N
//Non-Tail Recursion
public class Lab7 {
static void printNums(int n) {
	//Base Case
	if(n==0)
		return;
	
	//Recursive Call
	printNums(n-1);
	
	//Task Logic
	System.out.println(n);
	
}
	public static void main(String[] args) {
printNums(9);

	}

	

}
