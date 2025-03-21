package com.myjlc.loops;

//22.Print perfect Numbers from 1 to N 
//perfect Number:Sum of Divisibles(excluding Number)is same as the  Given Number
//6,28
public class Lab22 {
public static boolean isPerfect(int n) {
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0)
			sum+=i;
	}
	
	if(sum==n)
		return true;
		else
			return false;
}
	public static void main(String[] args) {
 int n=10000;
 for(int i=1;i<=n;i++) {
     if(isPerfect(i))
    	 System.out.println(i);
 }
	}
}

//Time complexity-O(n*n/2)/O(n2)
// Space complexity-O(1)
