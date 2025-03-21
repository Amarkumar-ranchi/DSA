package com.myjlc.loops;

//34.Check whether given number is Palindrome or Not
//palindrome no.=12321,121 etc
public class Lab34 {
public static boolean isPalindrome(int n) {
	int nCopy=n;
	int rev=0;
	 
	  
    while(n!=0) {
       
	  rev=rev*10+n%10;
	 n=n/10;
	 
 }
 return(rev==nCopy);
} 	


	public static void main(String[] args) {
		int n=12321;
 boolean flag=isPalindrome(n);
 System.out.println(flag);
	}
}


//Time complexity-O(d)where d-No.of Digits
// Space complexity-O(1)
