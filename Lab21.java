package com.myjlc.loops;

//21.Check whether give Number is perfect or Not
//perfect Number:Sum of Divisibles(excluding Number)is same as the  Given Number
//6,28
public class Lab21 {
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
 int n=20;
 boolean flag=isPerfect(n);
 System.out.println(flag);
	}
}

//Time complexity-O(n/2)
// Space complexity-O(1)
