package com.myjlc.loops;

//32.Print the Reverse of given Number 

public class Lab33 {
	


	public static void main(String[] args) {
		int n=12345;
 
 int rev=0;
 while(n!=0) {
	 int digit=n%10;
	 rev=rev*10+digit;
	 n=n/10;
	 
 }
 System.out.println(rev);
	}
}


//Time complexity-O(d)where d-No.of Digits
// Space complexity-O(1)
