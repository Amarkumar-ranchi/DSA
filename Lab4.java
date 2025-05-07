package com.myjlc.recursion;
public class Lab4 {
static void show(int n) {
	
	//Base Case
	if(n==0)
		return;
	
	//Recursive Call
	show(n-1);
	
	//Task Logic
		System.out.println("Welcome to Code World");
}
	public static void main(String[] args) {
show(5);

	}

	

}
