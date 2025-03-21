package com.myjlc.loops;

//29.Find the Factorial Digits of Given Number 
//Ex:5 ->5*4*3*2*1 =>120
//
public class Lab30 {

	public static void main(String[] args) {
		int n=19;
 long fact=1;
 for(int i=1;i<=n;i++) {
 fact=fact*i;
 }
 System.out.println(fact);
	}
}

//Time complexity-O(n)
// Space complexity-O(1)
