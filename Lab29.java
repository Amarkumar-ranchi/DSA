package com.myjlc.loops;

//29.Print Armstrong Numbers from 1 to N 
// Armstrong number :sum of cubes of digits is equal to number
//Ex:153 ->1+125+27 =>153
//370,371
public class Lab29 {

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
		int n=1000;
		for(int i=1;i<=n;i++) {
	if(isArmStrong(i))
	System.out.println(i);
		}
	}
}

//Time complexity-O(n*log n)
// Space complexity-O(1)
