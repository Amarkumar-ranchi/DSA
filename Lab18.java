package com.myjlc.loops;

//18.Check whether given number is prime or Not
//prime Number contains only 2 Divisibles 1 and itself
//Optimized
//More Optimized

public class Lab18 {
public static boolean isPrime(int n) {
	
	for(int i=2;i<=n/2;i++) {	
	     if(n%i ==0) {
	    	 return false;
	}
	}
return true;
}
	public static void main(String[] args) {
int n=11;
boolean flag=isPrime(n);
System.out.println(flag);
	}
}

//Time complexity-O(log n)Best case
//Time complexity-O(n/2)wrost case
// Space complexity-O(1)
