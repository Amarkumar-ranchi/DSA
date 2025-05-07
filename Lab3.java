package com.myjlc.recursion;
public class Lab3 {
static void show(int n) {
	//Base Case
	if(n==0)
		return;
	//Task Logic
	System.out.println("Welcome to Code World");
	//Recursive Call
	show(n-1);
}
	public static void main(String[] args) {
show(5);

	}

	

}
