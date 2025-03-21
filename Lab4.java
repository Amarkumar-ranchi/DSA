package com.myjlc.loops;

//4.Find Min and max of 2 Numbers

public class Lab4 {

	public static void main(String[] args) {
int a=10;
int b=20;

int min=(a<b)?a:b;
 System.out.println(min);
 
 int max=0;
 
if(a>b)
  max=a;
else
	max=b;
System.out.println(max);
	}

}

//Time complexity-O(1)
// Space complexity-O(1)
// 1 is constant