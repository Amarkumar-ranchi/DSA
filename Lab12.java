package com.myjlc.loops;

//12.Find the Sum of Cubes  Numbers from 1 to N

public class Lab12 {

	public static void main(String[] args) {
 long n=500;

long sum=0;
for(int i=1;i<=n;i++) {
     sum=sum+i*i*i;
} 
System.out.println("sum:"+sum);
	
	}
}

//Time complexity-O(n)
// Space complexity-O(1)
