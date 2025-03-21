package com.myjlc.loops;

//15.count the Divisibles of given number

public class Lab15 {

	public static void main(String[] args) {
 int n=10;
int count=2;
for(int i=2;i<=n/2;i++) {	
     if(n%i ==0) 
    	 count++;
} 
System.out.println("Count:"+count);
	}
}

//Time complexity-O(n/2)
// Space complexity-O(1)
