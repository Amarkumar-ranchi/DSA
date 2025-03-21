package com.myjlc.loops;

//14.print the Divisibles of given number

public class Lab14 {

	public static void main(String[] args) {
 int n=10;

for(int i=2;i<=n/4;i++) {
     if(n%i ==0)
     System.out.println(i);
} 	
	}
}

//Time complexity-O(n)
// Space complexity-O(1)
