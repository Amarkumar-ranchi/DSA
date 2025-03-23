package com.myjlc.leetcode;

//prime palindrome
public class Leetcode866 {
	public static boolean isPalindrome(int num) {
		 if (num < 0) {
	         return false;
	     }

	     int nCopy = num;
	     int revNum = 0;

	     while (num != 0) {
	         int digit = num % 10;
	         revNum = revNum * 10 + digit;
	         num = num / 10;
	     }

	     return nCopy == revNum;
	 }
	public static boolean isPrime(int n) {
		
		for(int i=2;i<=n/2;i++) {	
		     if(n%i ==0) {
		    	 return false;
		}
		}
	return true;
	}
	public static int isPrimePalindrome(int num) { 
	
	while(true) {
		if(isPalindrome(num)&& isPrime(num))
			return num;	
	num++;
	if(num>=10_00_000&&num<=100_00_000) {
	num=10_00_000;
	}
	}
	}
	
	

 public static void main(String[] args) {
     int num= 5_16_33_903;
int x=isPrimePalindrome(num);
System.out.println(x);
 }
}


