package com.myjlc.recursion;
//Problem 1:print the Number from N to 1

public class Lab6 {
static void printNums(int n) {
	//Base Case
	if(n==0)
		return;
	
	//Task Logic
	System.out.println(n);

	//Recursive Call
	printNums(n-1);
	
}
	public static void main(String[] args) {
printNums(9);

	}

	

}
