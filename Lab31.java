package com.myjlc.loops;

//29.Check Whether Given Number is Strong Number or Not
//Strong Number:Sum of factorials of digits is equal to given number
//123=>1!+2!+3!=1+2+t6>9
//145=>1!+4!+5!=1+24+120=145
public class Lab31 {
	

public static long factorial(int n) {
	long fact=1;
	for(int i=1;i<=n;i++) {
		fact =fact*i;
	}
	return fact;
}


	public static boolean isStrong(int n) {
		int ncopy=n;
		
		 long sum=0;
		 while(n!=0) {
			 int digit=n%10;
			 long fact =factorial(digit);
			sum+=fact;
			n=n/10;
		
	}
		 return (sum==ncopy);
	}
		public static void main(String[] args) {
			int n=145;
			boolean flag=isStrong(n);
			System.out.println(flag);
	 
	 }
	 
		
	}
	


//Time complexity-O(log n)
// Space complexity-O(1)
