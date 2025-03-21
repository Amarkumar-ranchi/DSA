package com.myjlc.loops;

//28.Check whether Given Number Armstrong number or not
// Armstrong number :sum of cubes of digits is equal to number
//Ex:153 ->1+125+27 =>153
//370,371
public class Lab28 {
public static  boolean isArmStrong(int n) {
	
int nCopy=n;	
 int sum=0;
 while(n!=0) {
	 int digit=n%10;
	sum=sum+digit*digit*digit;
	n=n/10;
 }
	if(sum==nCopy)
		return true;
	else
		return false;
 
	}
	public static void main(String[] args) {
		int n=372;
	boolean flag=isArmStrong(n);
	System.out.println(flag);
	}
}

//Time complexity-O(log n)
// Space complexity-O(1)
