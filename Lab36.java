package com.myjlc.loops;

// print the Fibonocii series
// Input:No.of terms in series
// 0,1,1,2,3,5,8,13 etc

public class Lab36 {
	public static void main(String[] args) {
		
		int n=6;
		
		int a=0;
		int b=1;
		  
		System.out.print(a+"\t"+b+"\t");
	   for(int i=1;i<=n;i++) {
		   int next=a+b;
		  System.out.print(next+"\t");
		  a=b;
		  b=next;
		  
	   }
			 
	    }
	}



//Time complexity-O(n)
// Space complexity-O(1)
