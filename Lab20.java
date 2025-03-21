package com.myjlc.loops;

//20.Find the Sum of Divisibles of given number(exclude N)

public class Lab20 {

	public static void main(String[] args) {
 int n=10;
 
int sum=0;
for(int i=2;i<=n/2;i++) {	
     if(n%i ==0) 
    	 sum+=i;
} 

System.out.println("sum:"+sum);
	}
}

//Time complexity-O(n/2)
// Space complexity-O(1)
