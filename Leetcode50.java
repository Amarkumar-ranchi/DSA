package com.myjlc.leetcode;

//power of three
public class Leetcode50 {
	 public static double Power(double x, long n) {
		 boolean nflag=false;
		 if(n==0)
			return 1;
		if(n==1)
			return x;
		
		if(n<0) {
			n=-n;
			nflag=true;
		}
		
		 double result=1;
		for(int i=1;i<=n/2;i++) {
			result=result*x*x;
		}
		if(n%2==1) {
			result=result*x;
		}
		if(nflag==true)
			return 1/result;
		
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
 



