package com.myjlc.bitwise;

//Reverse the Bits
public class Leetcode190 {
	public static int reverseBits( int num) {
	        
	int rev=0;
	for(int i=1;i<=32;i++) {
		rev=rev<<1;
		
		if((num&1)>0) {
			rev=rev+1;
		}
		num=num>>1;
	}
	
	return rev;
	
	    }
public static void main(String[]args) {

	int num=0B11111111111111111111111111111101;
int x=reverseBits(num);

	System.out.println(x);
}
          }

//Time complexity-O(1)


