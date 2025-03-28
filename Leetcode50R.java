package com.myjlc.leetcode;

//power of three
public class Leetcode50R {
	 public static double Power(double x, long n) {
		 boolean nflag=false;
		 if(n==0)
			return 1;
		if(n==1)
			return x;
		
		if(n<0) 
			return Power(1/x,-n);
			
		
		 double result= Power(x*x,n/2);

		
		if(n%2==1) {
			result=result*x;
		}
		
		
		return result;	 
	 }
	
	 public static double myPow(double x, int n) {
		return Power(x,n);
	 }
	
	
 public static void main(String[] args) {
 
	 double result= myPow(2,6);
	 System.out.println(result);
 }
}
 



