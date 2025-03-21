package com.myjlc.loops;

// 39.Evaluate the Following series
// 1+2/x+3/x2+4/x3+.....
public class Lab39 {
	public static double power(double x,double p) {
		double result=1;
		for(int i=1;i<=p;i++) {
			result=result*x;
		}
	return result;	
	}
	public static void main(String[] args) {
		
		int n=4;
		int x=2;
		
	double result=0.0;
	   for(int i=1;i<=n;i++) {
		  result=result+i/power(x,i-1); 
		 
	   }
	   
		System.out.println(result);	 
	    }
	}



//Time complexity-o(n)/O(n*p)
// Space complexity-O(1)
