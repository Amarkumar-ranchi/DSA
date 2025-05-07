package com.myjlc.recursion;
public class Lab5 {
static void show(int n) {
	//Task Logic
	System.out.println("Welcome to Code World");
	
	//Base Case
	if(n==1)
		return;
	
	//Recursive Call
	show(n-1);
	
}
	public static void main(String[] args) {
show(5);

	}

	

}
