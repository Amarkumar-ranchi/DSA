package com.myjlc.loops;

//19.print prime Numbers from 1 to N
//prime Number contains only 2 Divisibles 1 and itself
//More Optimized

public class Lab19 {
public static boolean isPrime(int n) {
	
	for(int i=2;i<=n/2;i++) {	
	     if(n%i ==0) {
	    	 return false;
	}
	}
return true;
}
	public static void main(String[] args) {
int n=50;
for(int i=1;i<=n;i++) {
	if(isPrime(i))
		System.out.println(i);
}
	}
}

//Time complexity-O(log n)Best case
//Time complexity-O(n/2)wrost case
// Space complexity-O(1)
