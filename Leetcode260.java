package com.myjlc.bitwise;

//136-Single Number-III
//Find the 2 Odd Elements in the Array

public class Leetcode260 {
	 public static int[] singleNumber(int[] nums) {
		 
	 int x=0;
	 for(int i=0;i<nums.length;i++) {
		 x=x^nums[i];
	 }
	 int maskBit=x&(~(x-1));
	int result[]= {0,0};
	 for(int i=0;i<nums.length;i++) {
		 if((nums[i]&maskBit)!=0) {
			 result[0]=result[0]^nums[i];
		 }else {
			 result[1]=result[1] ^nums[i]; 
		 }
	 }
	
		   return result;
	    }
	 
public static void main(String[]args) {

	int nums[]= {5,6,9,3,4,7,5,9,4,7};
int x[]=singleNumber(nums);
System.out.println(x[0]);
System.out.println(x[1]);
}
          }



