package com.myjlc.bitwise;

//136-Single Number
//Find the Odd Element in the Array

public class Leetcode136 {
	 public static int singleNumber(int[] nums) {
	 int result=0;
	 for(int i=0;i<=nums.length;i++) {
		 result=result^nums[i];
	 }
		   return result;
	    }
public static void main(String[]args) {

	int nums[]= {5,3,7,9,6,3,7,5,6};
int x=singleNumber(nums);
	System.out.println(x);
}
          }



