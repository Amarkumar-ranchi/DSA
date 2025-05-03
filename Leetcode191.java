package com.myjlc.bitwise;

//Problem : count the set Bits
//Brain Kerninghan's Algorithm
//Visit only Set bits instead of visting all the Bits

public class Leetcode191 {
	
	public static int hammingWeight(int num) {
		
		int count=0;
		while(num!=0) {
				count++;
			
			num=num& num-1;
		}
return count;
		}
	
public static void main(String[]args) {

	int num=19;
	int x=hammingWeight(num);
System.out.println(x);
}
          }

//Time complexity-O(1)


