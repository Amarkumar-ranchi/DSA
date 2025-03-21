package com.myjlc.loops;

// print the Following series
// Input:No.of terms in series
// 1,1,6,4,11,9,16,16,21,25 etc
public class Lab37 {
	public static void main(String[] args) {
		
		int n=5;
		
		int a=1;
		int b=1;
		  
	
	   for(int i=1;i<=n;i++) {
		   //1.First Series
		   System.out.print(a+"\t");
		   a=a+5;
		   
		   //2.Second Series
		   b=i*i;
		   System.out.print(b+"\t");
	   }
			 
	    }
	}



//Time complexity-O(n)
// Space complexity-O(1)
