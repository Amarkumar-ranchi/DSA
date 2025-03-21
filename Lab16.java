package com.myjlc.loops;

//16.Check whether given number is prime or Not
//prime Number contains only 2 Divisibles 1 and itself
public class Lab16 {
public static boolean isPrime(int n) {
	int count=0;
	for(int i=2;i<=n/2;i++) {	
	     if(n%i ==0) 
	    	 count++;
	}	
	if(count==0)
		return true;
		else 
			return false;
}
	public static void main(String[] args) {
int n=10;
boolean flag=isPrime(n);
System.out.println(flag);
	}
}

//Time complexity-O(n/2)
// Space complexity-O(1)
