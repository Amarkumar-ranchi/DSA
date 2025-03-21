package com.myjlc.loops;

// print the Following series
// Input:No.of terms in series
// 0,1,3,8,6,27,9,64,12,125 etc
public class Lab38 {
	public static void main(String[] args) {
		
		int n=5;
		
		int a=0;
		int b=1;
		  
	
	   for(int i=1;i<=n;i++) {
		   //1.First Series
		   System.out.print(a+"\t");
		   a=a+3;
		   
		   //2.Second Series
		   b=i*i*i;
		   System.out.print(b+"\t");
	   }
			 
	    }
	}



//Time complexity-O(n)
// Space complexity-O(1)
