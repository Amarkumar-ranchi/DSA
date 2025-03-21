package com.myjlc.loops;

//10.Find the Sum of Squares  Numbers from 1 to N

public class Lab10 {

	public static void main(String[] args) {
int n=6;

int sum=0;
for(int i=1;i<=n;i++) {
     sum=sum+i*i;
} 
System.out.println("sum:"+sum);
	
	}
}

//Time complexity-O(n)
// Space complexity-O(1)
