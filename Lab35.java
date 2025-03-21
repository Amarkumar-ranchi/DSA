package com.myjlc.loops;

//34.Find the Digits of Given Number in same Order
//n=123-1,2,3
public class Lab35 {
	public static void main(String[] args) {
		int n=12345;
		
		int rev=0;
		  
	    while(n!=0) {
	    	int digit=n%10;
		  rev=rev*10+digit;		  
		 n=n/10;		 
	 }
	    
	    while(rev!=0) {
	    	int digit=rev%10;
			  System.out.println(rev%10);  
			 rev=rev/10;
			 
	    }
	}
}


//Time complexity-O(d)where d-No.of Digits
// Space complexity-O(1)
